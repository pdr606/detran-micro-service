package com.example.detransimulate.service;

import com.example.detransimulate.entities.TrafficTicket;
import com.example.detransimulate.repository.DetranRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DetranService implements DetranGetaway {

    private final DetranRepository detranRepository;
    @Override
    public void generateDetranTrafficTicket(String plate) {
        detranRepository.save(new TrafficTicket(null, plate));
    }
}
