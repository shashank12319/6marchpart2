package com.wittybrains.busbookingsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wittybrains.busbookingsystem.model.Station;


public interface StationRepository extends JpaRepository<Station, Long> {


	
	    Optional<Station> findByStationCode(String stationCode);
	}



