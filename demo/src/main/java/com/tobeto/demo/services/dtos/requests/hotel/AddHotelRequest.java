package com.tobeto.demo.services.dtos.requests.hotel;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddHotelRequest {

    private int id;

    private String name;

    private String address;

    private String phoneNumber;
}
