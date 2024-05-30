package com.tobeto.demo.services.concretes;

import com.tobeto.demo.entities.Room;
import com.tobeto.demo.entities.RoomType;
import com.tobeto.demo.repositories.RoomRepository;
import com.tobeto.demo.services.abstracts.RoomService;
import com.tobeto.demo.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.demo.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.demo.services.dtos.responses.guest.DeleteGuestResponse;
import com.tobeto.demo.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.DeleteRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.UpdateRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.demo.services.mappers.RoomMapper;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<ListRoomResponse> getAll() {
        List<Room> roomList = roomRepository.findAll();
        List<ListRoomResponse> result = new ArrayList<>();
        for (Room room : roomList) {
            ListRoomResponse dto = RoomMapper.INSTANCE.ListRoomResponseToRoom(room);
            result.add(dto);
        }
        return result;
    }

    @Override
    public Room getById(int id) {
        return roomRepository.findById(id).orElseThrow();
    }

    @Override
    public AddRoomResponse add(AddRoomRequest request) {
        Room room = RoomMapper.INSTANCE.roomToAddRoomRequest(request);
        Room saved = roomRepository.save(room);
        AddRoomResponse response = RoomMapper.INSTANCE.addRoomResponseToRoom(saved);
        return response;
    }

    @Override
    public DeleteRoomResponse delete(int id) {
        Room findById = roomRepository.findById(id).orElseThrow();
        roomRepository.delete(findById);
        DeleteRoomResponse response = RoomMapper.INSTANCE.deleteRoomResponseToRoom(findById);
        return response;
    }

    @Override
    public UpdateRoomResponse update(UpdateRoomRequest request) {
        Room room = RoomMapper.INSTANCE.roomToUpdateRoomRequest(request);
        Room updated = roomRepository.save(room);
        UpdateRoomResponse response = RoomMapper.INSTANCE.updateRoomResponseToRoom(updated);
        return response;
    }

    @Override
    public List<ListRoomResponse> findAvailableRooms(Date startDate, Date endDate, RoomType roomType) {
        List<Room> availableRooms = roomRepository.findAvailableRooms(startDate, endDate, roomType);

        List<ListRoomResponse> responseList = new ArrayList<>();
        for (Room room : availableRooms) {
            ListRoomResponse response = new ListRoomResponse();
            response.setId(room.getId());
            response.setRoomNumber(room.getRoomNumber());
            //response.setRoomType(room.getType().getRooms()); ListRoomResponse kısmında yok
            //response.setHotelName(room.getHotel().getName()); ListRoomResponse kısmında yok
            response.setCapacity(room.getCapacity());
            response.setPrice(room.getPrice());
            response.setAvailable(room.getAvailable());
            responseList.add(response);
        }

        return responseList;
    }
}
