package com.tobeto.demo.repositories;

import com.tobeto.demo.entities.Room;
import com.tobeto.demo.entities.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    @Query("SELECT r FROM Room r WHERE r.available = true AND r.type.id = :roomTypeId " +
            "AND NOT EXISTS (SELECT rv FROM Reservation rv WHERE rv.room = r AND (:startDate BETWEEN rv.checkInDate AND rv.checkOutDate) " +
            "OR (:endDate BETWEEN rv.checkInDate AND rv.checkOutDate))")
    List<Room> findAvailableRooms(@Param("startDate") LocalDate startDate,
                                  @Param("endDate") LocalDate endDate,
                                  @Param("roomTypeId") int roomTypeId);




}
