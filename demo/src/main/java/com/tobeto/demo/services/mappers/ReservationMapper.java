package com.tobeto.demo.services.mappers;

import com.tobeto.demo.entities.Reservation;
import com.tobeto.demo.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.demo.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.demo.services.dtos.responses.reservation.AddReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.DeleteReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.ListReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.UpdateReservationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReservationMapper {

    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    Reservation reservationToAddReservationRequest(AddReservationRequest request);

    AddReservationResponse addReservationResponseToReservation(Reservation reservation);

    Reservation reservationToUpdateReservationRequest(UpdateReservationRequest request);

    UpdateReservationResponse updateReservationResponseToReservation(Reservation reservation);

    DeleteReservationResponse deleteReservationResponseToReservation(Reservation reservation);

    ListReservationResponse ListReservationResponseToReservation(Reservation reservation);
}
