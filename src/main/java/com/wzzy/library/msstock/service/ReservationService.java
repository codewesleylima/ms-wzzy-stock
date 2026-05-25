package com.wzzy.library.msstock.service;

import com.wzzy.library.msstock.dto.ReservationDTO;

import java.util.List;

public interface ReservationService {
    ReservationDTO createReservation(ReservationDTO reservationDTO);
    ReservationDTO getReservationById(String id);
    ReservationDTO getReservationByCode(String reservationCode);
    List<ReservationDTO> getReservationsByCustomerId(String customerId);
    List<ReservationDTO> getReservationsByOrderId(String orderId);

    ReservationDTO confirmReservation(String reservationId);
    ReservationDTO cancelReservation(String reservationId);

    void expireOldReservations();
}
