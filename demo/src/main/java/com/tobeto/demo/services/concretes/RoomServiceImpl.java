package com.tobeto.demo.services.concretes;

import com.tobeto.demo.entities.Hotel;
import com.tobeto.demo.entities.Reservation;
import com.tobeto.demo.entities.Room;
import com.tobeto.demo.entities.RoomType;
import com.tobeto.demo.repositories.RoomRepository;
import com.tobeto.demo.services.abstracts.HotelService;
import com.tobeto.demo.services.abstracts.ReservationService;
import com.tobeto.demo.services.abstracts.RoomService;
import com.tobeto.demo.services.abstracts.RoomTypeService;
import com.tobeto.demo.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.demo.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.demo.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.DeleteRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.UpdateRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.demo.services.mappers.RoomMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
    private final RoomTypeService roomTypeService;
    private final HotelService hotelService;
    private final ReservationService reservationService;

    public RoomServiceImpl(RoomRepository roomRepository, RoomTypeService roomTypeService, HotelService hotelService,@Lazy ReservationService reservationService) {
        this.roomRepository = roomRepository;
        this.roomTypeService = roomTypeService;
        this.hotelService = hotelService;
        this.reservationService = reservationService;
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
        RoomType type = roomTypeService.getById(request.getTypeId());
        Hotel hotel = hotelService.getById(request.getHotelId());
        Reservation reservation = reservationService.getById(request.getReservationIds().get(0));

        Room room = RoomMapper.INSTANCE.roomToAddRoomRequest(request);
        room.setType(type);
        room.setHotel(hotel);
        room.setReservations(List.of(reservation));


        room = roomRepository.save(room);
        AddRoomResponse response = RoomMapper.INSTANCE.addRoomResponseToRoom(room);
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
    public List<ListRoomResponse> findAvailableRooms(LocalDate startDate, LocalDate endDate, int roomTypeId) {
        // Belirtilen tarih aralığında ve belirli oda türünde müsait odaları bulmak için gereken sorguyu yapın
        List<Room> availableRooms = roomRepository.findAvailableRooms(startDate, endDate, roomTypeId);

        // Bulunan odaları ListRoomResponse formatına dönüştürün
        List<ListRoomResponse> availableRoomResponses = new ArrayList<>();
        for (Room room : availableRooms) {
            ListRoomResponse roomResponse = new ListRoomResponse();
            roomResponse.setId(room.getId());
            roomResponse.setRoomNumber(room.getRoomNumber());
            roomResponse.setCapacity(room.getCapacity());
            roomResponse.setPrice(room.getPrice());
            roomResponse.setAvailable(room.getAvailable());
            // Diğer gerekli bilgileri ekleyin
            availableRoomResponses.add(roomResponse);
        }

        return availableRoomResponses;
    }


}
