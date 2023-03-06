
package com.wittybrains.busbookingsystem.controller;

//
//import com.wittybrains.busbookingsystem.dto.StationDTO;
//import com.wittybrains.busbookingsystem.model.Station;
//import com.wittybrains.busbookingsystem.repository.StationRepository;
//import com.wittybrains.busbookingsystem.service.StationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/stations")
//public class StationController {
//
//    @Autowired
//	private StationRepository stationRepository;
//    @PostMapping
//    public ResponseEntity<String> createStation(@RequestBody StationDTO stationDTO) {
//    	// Create a new Station object
//	    Station station = new Station(stationDTO.getName(), stationDTO.getStationCode());
//
//	    // Save the Station to the database
//	    stationRepository.save(station);
//	    return new ResponseEntity<>("Successfully created station with ID: " + station.getId(), HttpStatus.CREATED);
//    }
//
//}

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wittybrains.busbookingsystem.dto.StationDTO;
import com.wittybrains.busbookingsystem.model.Station;
import com.wittybrains.busbookingsystem.repository.StationRepository;

@RestController
@RequestMapping("/stations")
public class StationController {

    @Autowired
    private StationRepository stationRepository;
    private final Logger logger = LoggerFactory.getLogger(StationController.class);

    @PostMapping
    public ResponseEntity<String> createStation(@RequestBody StationDTO stationDTO) {
        try {
            // Create a new Station object
            Station station = new Station(stationDTO.getName(), stationDTO.getStationCode());

            // Save the Station to the database
            stationRepository.save(station);
            logger.info("Successfully created station with ID: {}", station.getId());
            return new ResponseEntity<>("Successfully created station",HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error("Error creating station: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error creating station: " + e.getMessage());
        }
    }
}
