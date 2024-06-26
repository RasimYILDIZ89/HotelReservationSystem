package com.tobeto.demo.services.dtos.requests.guest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateGuestRequest {

    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;
}
