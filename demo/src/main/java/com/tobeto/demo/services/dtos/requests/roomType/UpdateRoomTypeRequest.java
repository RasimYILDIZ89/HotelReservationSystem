package com.tobeto.demo.services.dtos.requests.roomType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRoomTypeRequest {

    private int id;

    private String typeName;
}
