package com.tobeto.demo.services.dtos.responses.hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListHotelResponse {

    private int id;

    private String name;

    private String address;

    private String phoneNumber;
}
