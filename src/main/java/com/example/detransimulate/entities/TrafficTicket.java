package com.example.detransimulate.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TrafficTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String plate;
}
