package com.tobeto.demo.services.concretes;

import com.tobeto.demo.entities.RoomType;
import com.tobeto.demo.repositories.RoomTypeRepository;
import com.tobeto.demo.services.abstracts.RoomTypeService;
import com.tobeto.demo.services.dtos.requests.roomType.AddRoomTypeRequest;
import com.tobeto.demo.services.dtos.requests.roomType.UpdateRoomTypeRequest;
import com.tobeto.demo.services.dtos.responses.guest.DeleteGuestResponse;
import com.tobeto.demo.services.dtos.responses.roomType.AddRoomTypeResponse;
import com.tobeto.demo.services.dtos.responses.roomType.DeleteRoomTypeResponse;
import com.tobeto.demo.services.dtos.responses.roomType.ListRoomTypeResponse;
import com.tobeto.demo.services.dtos.responses.roomType.UpdateRoomTypeResponse;
import com.tobeto.demo.services.mappers.RoomTypeMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {

    private RoomTypeRepository roomTypeRepository;

    public RoomTypeServiceImpl(RoomTypeRepository roomTypeRepository) {
        this.roomTypeRepository = roomTypeRepository;
    }

    @Override
    public List<ListRoomTypeResponse> getAll() {
        List<RoomType> roomTypeList = roomTypeRepository.findAll();
        List<ListRoomTypeResponse> result = new ArrayList<>();
        for (RoomType roomType : roomTypeList) {
            ListRoomTypeResponse dto = RoomTypeMapper.INSTANCE.ListRoomTypeResponseToRoomType(roomType);
            result.add(dto);
        }
        return result;
    }

    @Override
    public RoomType getById(int id) {
        return roomTypeRepository.findById(id).orElseThrow();
    }

    @Override
    public AddRoomTypeResponse add(AddRoomTypeRequest request) {
        RoomType roomType = RoomTypeMapper.INSTANCE.roomTypeToAddRoomTypeRequest(request);
        RoomType saved = roomTypeRepository.save(roomType);
        AddRoomTypeResponse response = RoomTypeMapper.INSTANCE.addRoomTypeResponseToRoomType(saved);
        return response;
    }

    @Override
    public DeleteRoomTypeResponse delete(int id) {
        RoomType findById = roomTypeRepository.findById(id).orElseThrow();
        roomTypeRepository.delete(findById);
        DeleteRoomTypeResponse response = RoomTypeMapper.INSTANCE.deleteRoomTypeResponseToRoomType(findById);
        return response;
    }

    @Override
    public UpdateRoomTypeResponse update(UpdateRoomTypeRequest request) {
        RoomType roomType = RoomTypeMapper.INSTANCE.roomTypeToUpdateRoomTypeRequest(request);
        RoomType updated = roomTypeRepository.save(roomType);
        UpdateRoomTypeResponse response = RoomTypeMapper.INSTANCE.updateRoomTypeResponseToRoomType(updated);
        return response;
    }
}
