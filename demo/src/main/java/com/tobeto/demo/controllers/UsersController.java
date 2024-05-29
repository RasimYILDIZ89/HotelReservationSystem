package com.tobeto.demo.controllers;

import com.tobeto.demo.entities.Guest;
import com.tobeto.demo.entities.User;
import com.tobeto.demo.services.abstracts.UserService;
import com.tobeto.demo.services.dtos.requests.user.AddUserRequest;
import com.tobeto.demo.services.dtos.requests.user.UpdateUserRequest;
import com.tobeto.demo.services.dtos.responses.user.AddUserResponse;
import com.tobeto.demo.services.dtos.responses.user.DeleteUserResponse;
import com.tobeto.demo.services.dtos.responses.user.ListUserResponse;
import com.tobeto.demo.services.dtos.responses.user.UpdateUserResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@AllArgsConstructor
public class UsersController {

    private UserService userService;

    @GetMapping("/getAll")
    public List<ListUserResponse> getAll()
    {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@RequestParam int id)
    {
        return userService.getById(id);
    }

    @PostMapping("/add")
    public AddUserResponse add(@RequestBody AddUserRequest request) {
        return userService.add(request);
    }

    @PutMapping("/update")
    public UpdateUserResponse update(@RequestBody UpdateUserRequest request) {
       return userService.update(request);
    }

    @DeleteMapping("/delete/{id}")
    public DeleteUserResponse delete(@PathVariable("id") int id) {
       return userService.delete(id);
    }
}
