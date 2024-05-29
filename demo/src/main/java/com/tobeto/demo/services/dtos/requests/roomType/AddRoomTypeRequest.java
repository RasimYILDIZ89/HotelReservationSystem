package com.tobeto.demo.services.dtos.requests.roomType;

import com.tobeto.demo.entities.Room;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddRoomTypeRequest {

    private int id;

    private String typeName;


}
