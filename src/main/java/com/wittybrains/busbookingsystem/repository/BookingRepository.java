package com.wittybrains.busbookingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wittybrains.busbookingsystem.model.Booking;
import com.wittybrains.busbookingsystem.model.User;


public interface BookingRepository extends JpaRepository<Booking, Long> {
	   @SuppressWarnings("unchecked")
	Booking save(Booking booking);
    List<Booking> findByUser(User user);
}
