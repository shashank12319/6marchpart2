package com.wittybrains.busbookingsystem.service;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.wittybrains.busbookingsystem.dto.StationDTO;
import com.wittybrains.busbookingsystem.exception.StationNotFoundException;
import com.wittybrains.busbookingsystem.model.Station;
import com.wittybrains.busbookingsystem.repository.StationRepository;

@Service
public class StationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(StationService.class);

	private final StationRepository stationRepository;

	public StationService(StationRepository stationRepository) {
		this.stationRepository = stationRepository;
	}

	public String createStation(StationDTO stationDTO) {
		Station station = new Station(stationDTO.getName(), stationDTO.getStationCode());
		stationRepository.save(station);
		LOGGER.info("Created station with ID: {}", station.getId());
		return "Successfully created station with ID: " + station.getId();
	}

	public Station getStationByCode(String code) {
		if (StringUtils.isBlank(code)) {
			throw new IllegalArgumentException("Code must not be null or empty");
		}
		Optional<Station> optionalStation = stationRepository.findByStationCode(code);
		if (optionalStation.isPresent()) {
			Station station = optionalStation.get();
			LOGGER.debug("Found station with code {}: {}", code, station.getName());
			return station;
		} else {
			LOGGER.warn("Station with code {} not found", code);
			throw new StationNotFoundException("Station with code " + code + " not found");
		}
	}
}
