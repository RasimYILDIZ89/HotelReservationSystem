package com.tobeto.demo.services.concretes;

import com.tobeto.demo.entities.Reservation;
import com.tobeto.demo.repositories.ReservationRepository;
import com.tobeto.demo.services.abstracts.ReservationService;
import com.tobeto.demo.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.demo.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.demo.services.dtos.responses.guest.DeleteGuestResponse;
import com.tobeto.demo.services.dtos.responses.reservation.AddReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.DeleteReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.ListReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.UpdateReservationResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public List<ListReservationResponse> getAll() {
        return null;
    }

    @Override
    public Reservation getById(int id) {
        return null;
    }

    @Override
    public AddReservationResponse add(AddReservationRequest request) {
        return null;
    }

    @Override
    public DeleteReservationResponse delete(int id) {
        return null;
    }

    @Override
    public UpdateReservationResponse update(UpdateReservationRequest request) {
        return null;
    }
}
