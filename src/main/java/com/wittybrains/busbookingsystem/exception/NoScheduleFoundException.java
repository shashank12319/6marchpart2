package com.wittybrains.busbookingsystem.exception;

public class NoScheduleFoundException extends RuntimeException {
    public NoScheduleFoundException(String message) {
        super(message);
    }
}