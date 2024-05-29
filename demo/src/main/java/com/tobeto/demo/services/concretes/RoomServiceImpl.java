package com.tobeto.demo.services.concretes;

import com.tobeto.demo.entities.Room;
import com.tobeto.demo.repositories.RoomRepository;
import com.tobeto.demo.services.abstracts.RoomService;
import com.tobeto.demo.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.demo.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.demo.services.dtos.responses.guest.DeleteGuestResponse;
import com.tobeto.demo.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.DeleteRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.UpdateRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.ListRoomResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<ListRoomResponse> getAll() {
        return null;
    }

    @Override
    public Room getById(int id) {
        return null;
    }

    @Override
    public AddRoomResponse add(AddRoomRequest request) {
        return null;
    }

    @Override
    public DeleteRoomResponse delete(int id) {
        return null;
    }

    @Override
    public UpdateRoomResponse update(UpdateRoomRequest request) {
        return null;
    }
}
