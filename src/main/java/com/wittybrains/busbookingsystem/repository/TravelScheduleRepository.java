package com.wittybrains.busbookingsystem.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wittybrains.busbookingsystem.dto.TravelScheduleDTO;
import com.wittybrains.busbookingsystem.model.Station;
import com.wittybrains.busbookingsystem.model.TravelSchedule;


public interface TravelScheduleRepository extends JpaRepository<TravelSchedule, Long> {
	
	  List<TravelSchedule> findBySourceAndDestinationAndEstimatedArrivalTimeAfter(String source, String destination, LocalDateTime estimatedArrivalTime);

	List<TravelSchedule> findBySourceAndDestinationAndEstimatedArrivalTimeAfter(Station source, Station destination,
			LocalDateTime currentDateTime);
	
	}

