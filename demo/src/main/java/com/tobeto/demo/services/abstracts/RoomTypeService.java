package com.tobeto.demo.services.abstracts;

import com.tobeto.demo.entities.RoomType;
import com.tobeto.demo.services.dtos.requests.roomType.AddRoomTypeRequest;
import com.tobeto.demo.services.dtos.requests.roomType.UpdateRoomTypeRequest;
import com.tobeto.demo.services.dtos.responses.guest.DeleteGuestResponse;
import com.tobeto.demo.services.dtos.responses.roomType.AddRoomTypeResponse;
import com.tobeto.demo.services.dtos.responses.roomType.DeleteRoomTypeResponse;
import com.tobeto.demo.services.dtos.responses.roomType.ListRoomTypeResponse;
import com.tobeto.demo.services.dtos.responses.roomType.UpdateRoomTypeResponse;

import java.util.List;

public interface RoomTypeService {
    List<ListRoomTypeResponse> getAll();

    RoomType getById(int id);

    AddRoomTypeResponse add (AddRoomTypeRequest request);

    DeleteRoomTypeResponse delete (int id);

    UpdateRoomTypeResponse update(UpdateRoomTypeRequest request);
}
