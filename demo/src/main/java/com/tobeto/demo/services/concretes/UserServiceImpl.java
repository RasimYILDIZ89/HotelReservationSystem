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
import com.tobeto.demo.services.mappers.UserMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<ListUserResponse> getAll() {
        List<User> userList = userRepository.findAll();
        List<ListUserResponse> result = new ArrayList<>();
        for (User user : userList) {
            ListUserResponse dto = UserMapper.INSTANCE.ListUserResponseToUser(user);
            result.add(dto);
        }
        return result;
    }

    @Override
    public User getById(int id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public AddUserResponse add(AddUserRequest request) {
        User user = UserMapper.INSTANCE.userToAddUserRequest(request);
        User Saved = userRepository.save(user);
        AddUserResponse response = UserMapper.INSTANCE.addUserResponseToUser(Saved);
        return response;
    }

    @Override
    public DeleteUserResponse delete(int id) {
        User findById = userRepository.findById(id).orElseThrow();
        userRepository.delete(findById);
        DeleteUserResponse response = UserMapper.INSTANCE.deleteUserResponseToUser(findById);
        return response;
    }

    @Override
    public UpdateUserResponse update(UpdateUserRequest request) {
        User user = UserMapper.INSTANCE.userToUpdateUserRequest(request);
        User Updated = userRepository.save(user);
        UpdateUserResponse response = UserMapper.INSTANCE.updateUserResponseToUser(Updated);
        return response;
    }
}
