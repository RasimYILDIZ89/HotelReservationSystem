package com.tobeto.demo.repositories;

import com.tobeto.demo.entities.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository <Guest, Integer> {
}
