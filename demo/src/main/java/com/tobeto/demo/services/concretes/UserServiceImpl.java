package com.tobeto.demo.services.concretes;


import com.tobeto.demo.entities.User;
import com.tobeto.demo.repositories.UserRepository;
import com.tobeto.demo.services.abstracts.UserService;
import com.tobeto.demo.services.dtos.requests.user.AddUserRequest;
import com.tobeto.demo.services.dtos.requests.user.UpdateUserRequest;
import com.tobeto.demo.services.dtos.responses.guest.DeleteGuestResponse;
import com.tobeto.demo.services.dtos.responses.user.AddUserResponse;
import com.tobeto.demo.services.dtos.responses.user.DeleteUserResponse;
import com.tobeto.demo.services.dtos.responses.user.ListUserResponse;
import com.tobeto.demo.services.dtos.responses.user.UpdateUserResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<ListUserResponse> getAll() {
        return null;
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public AddUserResponse add(AddUserRequest request) {
        return null;
    }

    @Override
    public DeleteUserResponse delete(int id) {
        return null;
    }

    @Override
    public UpdateUserResponse update(UpdateUserRequest request) {
        return null;
    }
}
