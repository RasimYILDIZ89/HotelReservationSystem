package com.tobeto.demo.services.abstracts;

import com.tobeto.demo.entities.Room;
import com.tobeto.demo.entities.RoomType;
import com.tobeto.demo.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.demo.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.demo.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.DeleteRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.UpdateRoomResponse;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface RoomService {
    List<ListRoomResponse> getAll();

    Room getById(int id);

    AddRoomResponse add (AddRoomRequest request);

    DeleteRoomResponse delete (int id);

    UpdateRoomResponse update(UpdateRoomRequest request);

    List<ListRoomResponse> findAvailableRooms(LocalDate startDate, LocalDate endDate, int roomTypeId);
}




