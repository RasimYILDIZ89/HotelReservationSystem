package com.tobeto.demo.services.mappers;

import com.tobeto.demo.entities.Guest;
import com.tobeto.demo.entities.Reservation;
import com.tobeto.demo.services.abstracts.GuestService;
import com.tobeto.demo.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.demo.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.demo.services.dtos.responses.reservation.AddReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.DeleteReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.ListReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.UpdateReservationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReservationMapper {

    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);
    @Mapping(target = "room.id", source = "roomId")
    @Mapping(target = "guest.id", source = "guestId")
    Reservation reservationToAddReservationRequest(AddReservationRequest request);
    @Mapping(target = "roomId", source = "room.id")
    @Mapping(target = "guestId", source = "guest.id")
    AddReservationResponse addReservationResponseToReservation(Reservation reservation);

    Reservation reservationToUpdateReservationRequest(UpdateReservationRequest request);

    UpdateReservationResponse updateReservationResponseToReservation(Reservation reservation);

    DeleteReservationResponse deleteReservationResponseToReservation(Reservation reservation);

    ListReservationResponse ListReservationResponseToReservation(Reservation reservation);
}
