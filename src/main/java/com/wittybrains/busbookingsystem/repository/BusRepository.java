package com.wittybrains.busbookingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wittybrains.busbookingsystem.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {
   // List<Bus> findBySourceAndDestinationAndTiming(String source, String destination, String timing);
}
