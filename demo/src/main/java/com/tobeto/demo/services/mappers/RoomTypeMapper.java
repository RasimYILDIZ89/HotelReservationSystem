package com.tobeto.demo.services.mappers;

import com.tobeto.demo.entities.Room;
import com.tobeto.demo.entities.RoomType;
import com.tobeto.demo.services.dtos.requests.roomType.AddRoomTypeRequest;
import com.tobeto.demo.services.dtos.requests.roomType.UpdateRoomTypeRequest;
import com.tobeto.demo.services.dtos.responses.roomType.AddRoomTypeResponse;
import com.tobeto.demo.services.dtos.responses.roomType.DeleteRoomTypeResponse;
import com.tobeto.demo.services.dtos.responses.roomType.ListRoomTypeResponse;
import com.tobeto.demo.services.dtos.responses.roomType.UpdateRoomTypeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomTypeMapper {

    RoomTypeMapper INSTANCE = Mappers.getMapper(RoomTypeMapper.class);

    RoomType roomTypeToAddRoomTypeRequest(AddRoomTypeRequest request);

    AddRoomTypeResponse addRoomTypeResponseToRoomType(RoomType roomType);

    RoomType roomTypeToUpdateRoomTypeRequest(UpdateRoomTypeRequest request);

    UpdateRoomTypeResponse updateRoomTypeResponseToRoomType(RoomType roomType);

    DeleteRoomTypeResponse deleteRoomTypeResponseToRoomType(RoomType roomType);

    ListRoomTypeResponse ListRoomTypeResponseToRoomType(RoomType roomType);
}
