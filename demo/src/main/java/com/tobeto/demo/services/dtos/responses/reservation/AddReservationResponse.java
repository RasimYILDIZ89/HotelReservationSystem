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
public class AddReservationResponse {

    private int id;

    private int guestId;

    private int roomId;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

}
