package com.example.detransimulate.repository;

import com.example.detransimulate.entities.TrafficTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetranRepository extends JpaRepository<TrafficTicket, Long> {
}
