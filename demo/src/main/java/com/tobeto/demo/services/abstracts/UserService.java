package com.tobeto.demo.services.abstracts;

import com.tobeto.demo.entities.User;
import com.tobeto.demo.services.dtos.requests.user.AddUserRequest;
import com.tobeto.demo.services.dtos.requests.user.UpdateUserRequest;
import com.tobeto.demo.services.dtos.responses.guest.DeleteGuestResponse;
import com.tobeto.demo.services.dtos.responses.user.AddUserResponse;
import com.tobeto.demo.services.dtos.responses.user.DeleteUserResponse;
import com.tobeto.demo.services.dtos.responses.user.ListUserResponse;
import com.tobeto.demo.services.dtos.responses.user.UpdateUserResponse;

import java.util.List;

public interface UserService {
    List<ListUserResponse> getAll();

    User getById(int id);

    AddUserResponse add (AddUserRequest request);

    DeleteUserResponse delete (int id);

    UpdateUserResponse update(UpdateUserRequest request);
}
