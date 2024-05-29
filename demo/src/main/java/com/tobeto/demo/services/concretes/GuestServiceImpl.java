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
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    private GuestRepository guestRepository;

    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public List<ListGuestResponse> getAll() {
        return null;
    }

    @Override
    public Guest getById(int id) {
        return null;
    }

    @Override
    public AddGuestResponse add(AddGuestRequest request) {
        return null;
    }

    @Override
    public DeleteGuestResponse delete(int id) {
return null;
    }

    @Override
    public UpdateGuestResponse update(UpdateGuestRequest request) {
        return null;
    }
}
