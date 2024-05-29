package com.tobeto.demo.controllers;


import com.tobeto.demo.entities.Hotel;
import com.tobeto.demo.services.abstracts.HotelService;
import com.tobeto.demo.services.dtos.requests.hotel.AddHotelRequest;
import com.tobeto.demo.services.dtos.requests.hotel.UpdateHotelRequest;
import com.tobeto.demo.services.dtos.responses.hotel.AddHotelResponse;
import com.tobeto.demo.services.dtos.responses.hotel.DeleteHotelResponse;
import com.tobeto.demo.services.dtos.responses.hotel.ListHotelResponse;
import com.tobeto.demo.services.dtos.responses.hotel.UpdateHotelResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/hotel")
@AllArgsConstructor
public class HotelsController {

    private HotelService hotelService;

    @GetMapping("/getAll")
    public List<ListHotelResponse> getAll()
    {
        return hotelService.getAll();
    }

    @GetMapping("/{id}")
    public Hotel getById(@RequestParam int id)
    {
        return hotelService.getById(id);
    }

    @PostMapping("/add")
    public AddHotelResponse add(@RequestBody AddHotelRequest request) {
        return hotelService.add(request);
    }

    @PutMapping("/update")
    public UpdateHotelResponse update(@RequestBody UpdateHotelRequest request) {
       return hotelService.update(request);
    }

    @DeleteMapping("/delete/{id}")
    public DeleteHotelResponse delete(@PathVariable("id") int id) {
       return hotelService.delete(id);
    }
}
