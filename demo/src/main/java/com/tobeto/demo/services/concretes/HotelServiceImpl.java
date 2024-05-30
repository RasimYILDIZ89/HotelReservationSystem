package com.tobeto.demo.services.concretes;

import com.tobeto.demo.entities.Hotel;
import com.tobeto.demo.repositories.HotelRepository;
import com.tobeto.demo.services.abstracts.HotelService;
import com.tobeto.demo.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.demo.services.dtos.requests.hotel.UpdateHotelRequest;

import com.tobeto.demo.services.dtos.responses.hotel.AddHotelResponse;
import com.tobeto.demo.services.dtos.responses.hotel.DeleteHotelResponse;
import com.tobeto.demo.services.dtos.responses.hotel.ListHotelResponse;
import com.tobeto.demo.services.dtos.responses.hotel.UpdateHotelResponse;
import com.tobeto.demo.services.mappers.HotelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    private HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<ListHotelResponse> getAll() {
        List<Hotel> hotelList = hotelRepository.findAll();
        List<ListHotelResponse> result = new ArrayList<>();
        for (Hotel hotel : hotelList) {
            ListHotelResponse dto = HotelMapper.INSTANCE.ListHotelResponseToHotel(hotel);
            result.add(dto);
        }
        return result;
    }

    @Override
    public Hotel getById(int id) {
        return hotelRepository.findById(id).orElseThrow();
    }

    @Override
    public AddHotelResponse add(AddHotelRequest request) {
        Hotel hotel = HotelMapper.INSTANCE.hotelToAddHotelRequest(request);

        Hotel Saved = hotelRepository.save(hotel);

        AddHotelResponse response = HotelMapper.INSTANCE.addHotelResponseToHotel(Saved);
        return response;
    }

    @Override
    public DeleteHotelResponse delete(int id) {
        Hotel findById = hotelRepository.findById(id).orElseThrow();
        hotelRepository.delete(findById);
        DeleteHotelResponse response = HotelMapper.INSTANCE.deleteHotelResponseToHotel(findById);
        return response;
    }

    @Override
    public UpdateHotelResponse update(UpdateHotelRequest request) {
        Hotel hotel = HotelMapper.INSTANCE.hotelToUpdateHotelRequest(request);
        Hotel Updated = hotelRepository.save(hotel);
        UpdateHotelResponse response = HotelMapper.INSTANCE.updateHotelResponseToHotel(Updated);
        return response;
    }
}
