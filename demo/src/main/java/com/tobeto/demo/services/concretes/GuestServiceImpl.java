package com.tobeto.demo.services.concretes;

import com.tobeto.demo.entities.Guest;
import com.tobeto.demo.repositories.GuestRepository;
import com.tobeto.demo.services.abstracts.GuestService;
import com.tobeto.demo.services.dtos.requests.guest.AddGuestRequest;
import com.tobeto.demo.services.dtos.requests.guest.UpdateGuestRequest;
import com.tobeto.demo.services.dtos.responses.guest.AddGuestResponse;
import com.tobeto.demo.services.dtos.responses.guest.DeleteGuestResponse;
import com.tobeto.demo.services.dtos.responses.guest.ListGuestResponse;
import com.tobeto.demo.services.dtos.responses.guest.UpdateGuestResponse;
import com.tobeto.demo.services.mappers.GuestMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    private GuestRepository guestRepository;

    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public List<ListGuestResponse> getAll() {

        List<Guest> guestList = guestRepository.findAll();
        List<ListGuestResponse> result = new ArrayList<>();

        for (Guest guest : guestList) {

            ListGuestResponse dto = GuestMapper.INSTANCE.ListGuestResponseToGuest(guest);
            result.add(dto);
        }
        return result;
    }

    @Override
    public Guest getById(int id) {
        return guestRepository.findById(id).orElseThrow();
    }

    @Override
    public AddGuestResponse add(AddGuestRequest request) {
        Guest guest = GuestMapper.INSTANCE.guestToAddGuestRequest(request);

        Guest Saved = guestRepository.save(guest);

        AddGuestResponse response = GuestMapper.INSTANCE.addGuestResponseToGuest(Saved);
        return response;
    }

    @Override
    public DeleteGuestResponse delete(int id) {

        Guest findById = guestRepository.findById(id).orElseThrow();
        guestRepository.delete(findById);
        DeleteGuestResponse response = GuestMapper.INSTANCE.deleteGuestResponseToGuest(findById);
        return response;
    }

    @Override
    public UpdateGuestResponse update(UpdateGuestRequest request) {

        Guest guest = GuestMapper.INSTANCE.guestToUpdateGuestRequest(request);
        Guest Updated = guestRepository.save(guest);
        UpdateGuestResponse response = GuestMapper.INSTANCE.updateGuestResponseToGuest(Updated);
        return response;
    }
}
