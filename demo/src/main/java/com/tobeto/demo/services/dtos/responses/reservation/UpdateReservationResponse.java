package com.tobeto.demo.services.dtos.responses.reservation;

import com.tobeto.demo.entities.Guest;
import com.tobeto.demo.entities.Room;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateReservationResponse {

    private int id;

    private Guest guest;

    private Room room;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;
}
