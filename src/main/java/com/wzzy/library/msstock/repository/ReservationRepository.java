package com.wzzy.library.msstock.repository;

import com.wzzy.library.msstock.entity.Reservation;
import com.wzzy.library.msstock.enums.ReservationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
    List<Reservation> findByCustomerId(String customerId);
    List<Reservation> findByOrderId(String orderId);
    List<Reservation> findByStockItemId(String stockItemId);
    List<Reservation> findByStatus(ReservationStatus status);
    Optional<Reservation> findByReservationCode(String reservationCode);
    List<Reservation> findByExpiresAtBeforeAndStatus(LocalDateTime expiresAt, ReservationStatus status);
}
