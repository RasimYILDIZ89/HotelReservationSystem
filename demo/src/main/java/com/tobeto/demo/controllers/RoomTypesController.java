package com.tobeto.demo.controllers;

import com.tobeto.demo.entities.Guest;
import com.tobeto.demo.entities.RoomType;
import com.tobeto.demo.services.abstracts.RoomTypeService;
import com.tobeto.demo.services.dtos.requests.roomType.AddRoomTypeRequest;
import com.tobeto.demo.services.dtos.requests.roomType.UpdateRoomTypeRequest;
import com.tobeto.demo.services.dtos.responses.roomType.AddRoomTypeResponse;
import com.tobeto.demo.services.dtos.responses.roomType.DeleteRoomTypeResponse;
import com.tobeto.demo.services.dtos.responses.roomType.ListRoomTypeResponse;
import com.tobeto.demo.services.dtos.responses.roomType.UpdateRoomTypeResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/roomType")
@AllArgsConstructor
public class RoomTypesController {

    private RoomTypeService roomTypeService;

    @GetMapping("/getAll")
    public List<ListRoomTypeResponse> getAll()
    {
        return roomTypeService.getAll();
    }

    @GetMapping("/{id}")
    public RoomType getById(@RequestParam int id)
    {
        return roomTypeService.getById(id);
    }

    @PostMapping("/add")
    public AddRoomTypeResponse add(@RequestBody AddRoomTypeRequest request) {
        return roomTypeService.add(request);
    }

    @PutMapping("/update")
    public UpdateRoomTypeResponse update(@RequestBody UpdateRoomTypeRequest request) {
       return roomTypeService.update(request);
    }

    @DeleteMapping("/delete/{id}")
    public DeleteRoomTypeResponse delete(@PathVariable("id") int id) {
       return roomTypeService.delete(id);
    }
}
