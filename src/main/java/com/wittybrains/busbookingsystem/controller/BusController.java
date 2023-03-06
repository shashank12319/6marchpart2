package com.wittybrains.busbookingsystem.controller;

import java.util.List;

//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.wittybrains.busbookingsystem.dto.BusDTO;
//import com.wittybrains.busbookingsystem.service.BusService;


//
//@RestController
//@RequestMapping("/bus")
//public class BusController {
//
//    private final BusService busService;
//
//    public BusController(BusService busService) {
//        this.busService = busService;
//    }
//
//    @PostMapping("/createBuses")
//    public ResponseEntity<List<BusDTO>> createBuses(@RequestBody List<BusDTO> busList) {
//        try {
//            List<BusDTO> createdBuses = busService.createBuses(busList);
//            return ResponseEntity.status(HttpStatus.CREATED).body(createdBuses);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
//        }
//    }
//}
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wittybrains.busbookingsystem.dto.BusDTO;
import com.wittybrains.busbookingsystem.service.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {

    private final BusService busService;
    private final Logger logger = LoggerFactory.getLogger(BusController.class);

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @PostMapping("/createBuses")
    public ResponseEntity<List<BusDTO>> createBuses(@RequestBody List<BusDTO> busList) {
        try {
            List<BusDTO> createdBuses = busService.createBuses(busList);
            logger.info("Buses created successfully.");
            return ResponseEntity.status(HttpStatus.CREATED).body(createdBuses);
        } catch (Exception e) {
            logger.error("Error creating buses: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}





