package com.wittybrains.busbookingsystem.dto;

import com.wittybrains.busbookingsystem.model.TravelSchedule;

public class TravelScheduleDTO {
   
   // private Long busId;
    private StationDTO source;
    private StationDTO destination;
    private Double fareAmount;
    private String estimatedArrivalTime;
    private String estimatedDepartureTime;
    private String date;
    private Long id;
    
    
	public TravelScheduleDTO() {
		super();
	}
	public TravelScheduleDTO(TravelSchedule travelSchedule) {
		super();
		if(travelSchedule!=null) {
			
			//this.busId = travelSchedule.getBus().getId();	
		//this.busId=new BusDTO(travelSchedule.getBus());
		this.source=new StationDTO(travelSchedule.getSource());
		this.destination=new StationDTO(travelSchedule.getDestination());
		this.fareAmount=travelSchedule.getFareAmount();
		this.estimatedArrivalTime=travelSchedule.getEstimatedArrivalTime().toString();
		this.estimatedDepartureTime=travelSchedule.getEstimatedDepartureTime().toString();
		}
		
		
	
	}
public TravelScheduleDTO(String string) {
		// TODO Auto-generated constructor stub
	}
	//	public Long getBusId() {
//		return busId;
//	}
//	public void setBusId(Long busId) {
//		this.busId = busId;
//	}
	public StationDTO getSource() {
		return source;
	}
	public void setSource(StationDTO source) {
		this.source = source;
	}
	public StationDTO getDestination() {
		return destination;
	}
	public void setDestination(StationDTO destination) {
		this.destination = destination;
	}
	public Double getFareAmount() {
		return fareAmount;
	}
	public void setFareAmount(Double fareAmount) {
		this.fareAmount = fareAmount;
	}
	public String getEstimatedArrivalTime() {
		return estimatedArrivalTime;
	}
	public void setEstimatedArrivalTime(String estimatedArrivalTime) {
		this.estimatedArrivalTime = estimatedArrivalTime;
	}
	public String getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(String estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
   

    

}
