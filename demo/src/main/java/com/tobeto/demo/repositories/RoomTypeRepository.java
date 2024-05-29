package com.tobeto.demo.repositories;

import com.tobeto.demo.entities.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomTypeRepository extends JpaRepository <RoomType, Integer> {
}
