package com.tobeto.demo.services.abstracts;

import com.tobeto.demo.entities.Reservation;
import com.tobeto.demo.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.demo.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.demo.services.dtos.responses.guest.DeleteGuestResponse;
import com.tobeto.demo.services.dtos.responses.reservation.AddReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.DeleteReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.ListReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.UpdateReservationResponse;

import java.util.List;

public interface ReservationService {
    List<ListReservationResponse> getAll();

    Reservation getById(int id);

    AddReservationResponse add (AddReservationRequest request);

    DeleteReservationResponse delete (int id);

    UpdateReservationResponse update(UpdateReservationRequest request);
}
