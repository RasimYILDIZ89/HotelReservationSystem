package com.tobeto.demo.services.dtos.requests.user;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddUserRequest {

    private int id;

    private String email;

    private String firstName;

    private String lastName;

    private String password;

}
