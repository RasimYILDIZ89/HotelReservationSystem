package com.tobeto.demo.services.mappers;

import com.tobeto.demo.entities.Guest;
import com.tobeto.demo.services.dtos.requests.guest.AddGuestRequest;
import com.tobeto.demo.services.dtos.requests.guest.UpdateGuestRequest;
import com.tobeto.demo.services.dtos.responses.guest.AddGuestResponse;
import com.tobeto.demo.services.dtos.responses.guest.DeleteGuestResponse;
import com.tobeto.demo.services.dtos.responses.guest.ListGuestResponse;
import com.tobeto.demo.services.dtos.responses.guest.UpdateGuestResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GuestMapper {

    GuestMapper INSTANCE = Mappers.getMapper(GuestMapper.class);

    Guest guestToAddGuestRequest(AddGuestRequest request);

    AddGuestResponse addGuestResponseToGuest(Guest guest);

    Guest guestToUpdateGuestRequest(UpdateGuestRequest request);

    UpdateGuestResponse updateGuestResponseToGuest(Guest guest);

    DeleteGuestResponse deleteGuestResponseToGuest(Guest guest);

    ListGuestResponse ListGuestResponseToGuest(Guest guest);
}
