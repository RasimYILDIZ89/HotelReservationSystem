package com.tobeto.demo.controllers;

import com.tobeto.demo.entities.Guest;
import com.tobeto.demo.entities.Room;
import com.tobeto.demo.services.abstracts.RoomService;
import com.tobeto.demo.services.dtos.requests.room.AddRoomRequest;
import com.tobeto.demo.services.dtos.requests.room.UpdateRoomRequest;
import com.tobeto.demo.services.dtos.responses.room.AddRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.DeleteRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.ListRoomResponse;
import com.tobeto.demo.services.dtos.responses.room.UpdateRoomResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/room")
@AllArgsConstructor
public class RoomsController {

    private RoomService roomService;

    @GetMapping("/getAll")
    public List<ListRoomResponse> getAll()
    {
        return roomService.getAll();
    }

    @GetMapping("/{id}")
    public Room getById(@RequestParam int id)
    {
        return roomService.getById(id);
    }

    @PostMapping("/add")
    public AddRoomResponse add(@RequestBody AddRoomRequest request) {
        return roomService.add(request);
    }

    @PutMapping("/update")
    public UpdateRoomResponse update(@RequestBody UpdateRoomRequest request) {
       return roomService.update(request);
    }

    @DeleteMapping("/delete/{id}")
    public DeleteRoomResponse delete(@PathVariable("id") int id) {
       return roomService.delete(id);
    }
}
