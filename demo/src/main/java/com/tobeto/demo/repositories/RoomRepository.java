package com.tobeto.demo.repositories;

import com.tobeto.demo.entities.Room;
import com.tobeto.demo.entities.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Integer> {

    @Query("SELECT r FROM Room r LEFT JOIN r.reservations res " +
            "WHERE r.type = :roomType " +
            "AND r.available = true " +
            "AND (res.checkOutDate  > :startDate OR res.checkInDate < :endDate)")
    List<Room> findAvailableRooms(@Param("startDate") Date startDate,
                                  @Param("endDate") Date endDate,
                                  @Param("roomType") RoomType roomType);
}
