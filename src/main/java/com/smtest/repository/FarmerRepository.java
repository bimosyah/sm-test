package com.smtest.repository;

import com.smtest.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FarmerRepository extends JpaRepository<Farmer, String> {
    List<Farmer> findAllByActiveTrue();
}