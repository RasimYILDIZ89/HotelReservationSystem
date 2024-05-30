package com.tobeto.demo.services.mappers;

import com.tobeto.demo.entities.User;
import com.tobeto.demo.services.dtos.requests.user.AddUserRequest;
import com.tobeto.demo.services.dtos.requests.user.UpdateUserRequest;
import com.tobeto.demo.services.dtos.responses.user.AddUserResponse;
import com.tobeto.demo.services.dtos.responses.user.DeleteUserResponse;
import com.tobeto.demo.services.dtos.responses.user.ListUserResponse;
import com.tobeto.demo.services.dtos.responses.user.UpdateUserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userToAddUserRequest(AddUserRequest request);

    AddUserResponse addUserResponseToUser(User user);

    User userToUpdateUserRequest(UpdateUserRequest request);

    UpdateUserResponse updateUserResponseToUser(User user);

    DeleteUserResponse deleteUserResponseToUser(User user);

    ListUserResponse ListUserResponseToUser(User user);
}
