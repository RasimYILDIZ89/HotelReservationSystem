package com.tobeto.demo.services.concretes;

import com.tobeto.demo.entities.Guest;
import com.tobeto.demo.entities.Reservation;
import com.tobeto.demo.entities.Room;
import com.tobeto.demo.repositories.ReservationRepository;
import com.tobeto.demo.services.abstracts.GuestService;
import com.tobeto.demo.services.abstracts.ReservationService;
import com.tobeto.demo.services.abstracts.RoomService;
import com.tobeto.demo.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.demo.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.demo.services.dtos.responses.reservation.AddReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.DeleteReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.ListReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.UpdateReservationResponse;
import com.tobeto.demo.services.mappers.ReservationMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRepository;

    private RoomService roomService;

    private GuestService guestService;

    public ReservationServiceImpl(ReservationRepository reservationRepository,@Lazy RoomService roomService,GuestService guestService) {
        this.roomService = roomService;
        this.guestService = guestService;
        this.reservationRepository = reservationRepository;
    }

    @Override
    public List<ListReservationResponse> getAll() {
        List<Reservation> reservationList = reservationRepository.findAll();
        List<ListReservationResponse> result = new ArrayList<>();
        for (Reservation reservation : reservationList) {
            ListReservationResponse dto = ReservationMapper.INSTANCE.ListReservationResponseToReservation(reservation);
            result.add(dto);
        }
        return result;
    }

    @Override
    public Reservation getById(int id) {
        return reservationRepository.findById(id).orElseThrow();
    }

    @Override
    public AddReservationResponse add(AddReservationRequest request) {
        Room room = roomService.getById(request.getRoomId());
        Guest guest = guestService.getById(request.getGuestId());

        Reservation reservation = ReservationMapper.INSTANCE.reservationToAddReservationRequest(request);

        reservation.setRoom(room);
        reservation.setGuest(guest);

        reservation = reservationRepository.save(reservation);
        AddReservationResponse response = ReservationMapper.INSTANCE.addReservationResponseToReservation(reservation);
        return response;
    }

    @Override
    public DeleteReservationResponse delete(int id) {
        Reservation findById = reservationRepository.findById(id).orElseThrow();
        reservationRepository.delete(findById);
        DeleteReservationResponse response = ReservationMapper.INSTANCE.deleteReservationResponseToReservation(findById);
        return response;
    }

    @Override
    public UpdateReservationResponse update(UpdateReservationRequest request) {
        Reservation reservation = ReservationMapper.INSTANCE.reservationToUpdateReservationRequest(request);
        Reservation Updated = reservationRepository.save(reservation);
        UpdateReservationResponse response = ReservationMapper.INSTANCE.updateReservationResponseToReservation(Updated);
        return response;
    }



}

