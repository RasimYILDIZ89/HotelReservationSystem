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
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    private HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<ListHotelResponse> getAll() {
        return null;
    }

    @Override
    public Hotel getById(int id) {
        return null;
    }

    @Override
    public AddHotelResponse add(AddHotelRequest request) {
        return null;
    }

    @Override
    public DeleteHotelResponse delete(int id) {
        return null;
    }

    @Override
    public UpdateHotelResponse update(UpdateHotelRequest request) {
        return null;
    }
}
