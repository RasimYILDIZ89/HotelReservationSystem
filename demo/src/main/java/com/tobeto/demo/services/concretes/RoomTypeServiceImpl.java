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
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {

    private RoomTypeRepository roomTypeRepository;

    public RoomTypeServiceImpl(RoomTypeRepository roomTypeRepository) {
        this.roomTypeRepository = roomTypeRepository;
    }

    @Override
    public List<ListRoomTypeResponse> getAll() {
        return null;
    }

    @Override
    public RoomType getById(int id) {
        return null;
    }

    @Override
    public AddRoomTypeResponse add(AddRoomTypeRequest request) {
        return null;
    }

    @Override
    public DeleteRoomTypeResponse delete(int id) {
        return null;
    }

    @Override
    public UpdateRoomTypeResponse update(UpdateRoomTypeRequest request) {
        return null;
    }
}
