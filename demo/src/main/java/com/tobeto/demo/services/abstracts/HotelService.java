package com.tobeto.demo.services.abstracts;

import com.tobeto.demo.entities.Hotel;
import com.tobeto.demo.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.demo.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.demo.services.dtos.responses.guest.DeleteGuestResponse;
import com.tobeto.demo.services.dtos.responses.hotel.AddHotelResponse;
import com.tobeto.demo.services.dtos.responses.hotel.DeleteHotelResponse;
import com.tobeto.demo.services.dtos.responses.hotel.ListHotelResponse;
import com.tobeto.demo.services.dtos.responses.hotel.UpdateHotelResponse;

import java.util.List;

public interface HotelService {
    List<ListHotelResponse> getAll();

    Hotel getById(int id);

    AddHotelResponse add (AddHotelRequest request);

    DeleteHotelResponse delete (int id);

    UpdateHotelResponse update(UpdateHotelRequest request);
}
