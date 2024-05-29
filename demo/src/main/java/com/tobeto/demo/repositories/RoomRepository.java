package com.tobeto.demo.repositories;

import com.tobeto.demo.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
