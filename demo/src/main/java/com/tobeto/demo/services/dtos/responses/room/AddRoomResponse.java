package com.tobeto.demo.services.dtos.responses.room;

import com.tobeto.demo.entities.Hotel;
import com.tobeto.demo.entities.Reservation;
import com.tobeto.demo.entities.RoomType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddRoomResponse {

    private int id;

    private String roomNumber;

    private int capacity;

    private double price;

    private Boolean available;
}
