package com.wzzy.library.msstock.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "availability")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Availability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long availabilityIdEntity;

    @Column(nullable = false, unique = true)
    private Long bookIdEntity;

    @Column(nullable = false)
    private String statusEntity;

    @Column(nullable = false)
    private Integer quantityAvailableEntity;

    @Column(nullable = false)
    private LocalDateTime lastCheckedEntity = LocalDateTime.now();

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAtEntity = LocalDateTime.now();
}
