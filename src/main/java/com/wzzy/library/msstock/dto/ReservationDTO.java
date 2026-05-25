package com.wzzy.library.msstock.dto;

import com.wzzy.library.msstock.enums.ReservationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDTO {
    private String id;
    private String customerId;
    private String stockItemId;
    private String bookId;
    private String orderId;
    private int reservedQuantity;
    private ReservationStatus status;
    private String reservationCode;
    private String reservedAt;
    private String expiresAt;
    private String confirmedAt;
    private String cancelledAt;
    private String updatedAt;
}
