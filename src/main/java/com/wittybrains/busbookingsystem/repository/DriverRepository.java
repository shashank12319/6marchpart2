package com.wittybrains.busbookingsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wittybrains.busbookingsystem.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

}
