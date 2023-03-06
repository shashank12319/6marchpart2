package com.wittybrains.busbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wittybrains.busbookingsystem.model.Seat;







public interface SeatRepository extends JpaRepository<Seat, Long> {
}
