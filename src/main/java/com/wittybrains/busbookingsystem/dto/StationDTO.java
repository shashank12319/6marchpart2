package com.wittybrains.busbookingsystem.dto;

import com.wittybrains.busbookingsystem.model.Station;

public class StationDTO {
	
	private String name;
	
	private String stationCode;
	public StationDTO() {
		
	}
	private Long id;
	public StationDTO(Station station) {
		if(station!=null) {
		this.name=station.getName();
		this.stationCode=station.getStationCode();
	}
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStationCode() {
		return stationCode;
	}
	
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

