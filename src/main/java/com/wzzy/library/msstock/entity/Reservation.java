package com.wzzy.library.msstock.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationIdEntity;

    @Column(nullable = false)
    private Long customerIdEntity;

    @Column(nullable = false)
    private Long bookIdEntity;

    private Long orderIdEntity;

    @Column(nullable = false)
    private Integer reservedQuantityEntity;

    @Column(nullable = false)
    private LocalDateTime reservationDateEntity = LocalDateTime.now();

    private LocalDateTime expiryDateEntity;

    @Column(nullable = false)
    private String statusEntity = "ACTIVE";

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAtEntity = LocalDateTime.now();
}
