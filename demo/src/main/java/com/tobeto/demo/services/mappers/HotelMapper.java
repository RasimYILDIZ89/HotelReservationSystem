package com.tobeto.demo.services.mappers;

import com.tobeto.demo.entities.Hotel;
import com.tobeto.demo.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.demo.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.demo.services.dtos.responses.hotel.AddHotelResponse;
import com.tobeto.demo.services.dtos.responses.hotel.DeleteHotelResponse;
import com.tobeto.demo.services.dtos.responses.hotel.ListHotelResponse;
import com.tobeto.demo.services.dtos.responses.hotel.UpdateHotelResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HotelMapper {

    HotelMapper INSTANCE = Mappers.getMapper(HotelMapper.class);

    Hotel hotelToAddHotelRequest(AddHotelRequest request);

    AddHotelResponse addHotelResponseToHotel(Hotel hotel);

    Hotel hotelToUpdateHotelRequest(UpdateHotelRequest request);

    UpdateHotelResponse updateHotelResponseToHotel(Hotel hotel);

    DeleteHotelResponse deleteHotelResponseToHotel(Hotel hotel);

    ListHotelResponse ListHotelResponseToHotel(Hotel hotel);
}
