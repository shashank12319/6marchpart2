package com.wittybrains.busbookingsystem.controller;

import java.util.List;

import com.wittybrains.busbookingsystem.dto.TravelScheduleDTO;

public class TravelScheduleResponseWrapper {
    private String message;
    private List<TravelScheduleDTO> schedules;

    public TravelScheduleResponseWrapper(String message, List<TravelScheduleDTO> schedules) {
        this.message = message;
        this.schedules = schedules;
    }

    public String getMessage() {
        return message;
    }

    public List<TravelScheduleDTO> getSchedules() {
        return schedules;
    }
}
