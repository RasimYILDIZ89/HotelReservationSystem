package com.tobeto.demo.controllers;

import com.tobeto.demo.entities.Guest;
import com.tobeto.demo.entities.Reservation;
import com.tobeto.demo.entities.Room;
import com.tobeto.demo.services.abstracts.GuestService;
import com.tobeto.demo.services.abstracts.ReservationService;
import com.tobeto.demo.services.abstracts.RoomService;
import com.tobeto.demo.services.dtos.requests.reservation.AddReservationRequest;
import com.tobeto.demo.services.dtos.requests.reservation.UpdateReservationRequest;
import com.tobeto.demo.services.dtos.responses.reservation.AddReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.DeleteReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.ListReservationResponse;
import com.tobeto.demo.services.dtos.responses.reservation.UpdateReservationResponse;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/reservation")
@AllArgsConstructor
public class ReservationsController {

    private ReservationService reservationService;

    private RoomService roomService;

    private GuestService guestService;

    @GetMapping("/getAll")
    public List<ListReservationResponse> getAll()
    {
        return reservationService.getAll();
    }

    @GetMapping("/{id}")
    public Reservation getById(@RequestParam int id)
    {
        return reservationService.getById(id);
    }

    @PostMapping("/add")
    public AddReservationResponse add(@RequestBody AddReservationRequest request) {
        return reservationService.add(request);
    }

    @PutMapping("/update")
    public UpdateReservationResponse update(@RequestBody UpdateReservationRequest request) {
      return reservationService.update(request);
    }

    @DeleteMapping("/delete/{id}")
    public DeleteReservationResponse delete(@PathVariable("id") int id) {
       return reservationService.delete(id);
    }


}
