package com.tobeto.demo.controllers;

import com.tobeto.demo.entities.Guest;
import com.tobeto.demo.services.abstracts.GuestService;
import com.tobeto.demo.services.dtos.requests.guest.AddGuestRequest;
import com.tobeto.demo.services.dtos.requests.guest.UpdateGuestRequest;
import com.tobeto.demo.services.dtos.responses.guest.AddGuestResponse;
import com.tobeto.demo.services.dtos.responses.guest.DeleteGuestResponse;
import com.tobeto.demo.services.dtos.responses.guest.ListGuestResponse;
import com.tobeto.demo.services.dtos.responses.guest.UpdateGuestResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/guest")
@AllArgsConstructor
public class GuestsController {
    private GuestService guestService;

    @GetMapping("/getAll")
    public List<ListGuestResponse> getAll() {
        return guestService.getAll();
    }

    @GetMapping("/{id}")
    public Guest getById(@RequestParam int id) {
        return guestService.getById(id);
    }

    @PostMapping("/add")
    public AddGuestResponse add(@RequestBody AddGuestRequest request) {
        return guestService.add(request);
    }

    @PutMapping("/update")
    public UpdateGuestResponse update(@RequestBody UpdateGuestRequest request) {
        return guestService.update(request);
    }

    @DeleteMapping("/delete/{id}")
    public DeleteGuestResponse delete(@PathVariable("id") int id) {
        return guestService.delete(id);
    }
}