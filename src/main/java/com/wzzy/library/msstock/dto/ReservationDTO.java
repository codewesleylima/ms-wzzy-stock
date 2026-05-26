package com.wzzy.library.msstock.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDTO {

    private Long id;
    private Long customerId;
    private Long bookId;
    private Long orderId;
    private Integer reservedQuantity;
    private LocalDateTime reservationDate;
    private LocalDateTime expiryDate;
    private String status;
}
