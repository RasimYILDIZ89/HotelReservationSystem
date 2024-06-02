package com.tobeto.demo.services.mappers;


import com.tobeto.demo.entities.Room;
import com.tobeto.demo.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.demo.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.demo.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.DeleteRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.UpdateRoomResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RoomMapper {

    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);

    Room roomToAddRoomRequest(AddRoomRequest request);

    AddRoomResponse addRoomResponseToRoom(Room room);

    Room roomToUpdateRoomRequest(UpdateRoomRequest request);

    UpdateRoomResponse updateRoomResponseToRoom(Room room);

    DeleteRoomResponse deleteRoomResponseToRoom(Room room);

    ListRoomResponse ListRoomResponseToRoom(Room room);

    List<ListRoomResponse> roomsToListRoomResponses(List<Room> rooms);
}
