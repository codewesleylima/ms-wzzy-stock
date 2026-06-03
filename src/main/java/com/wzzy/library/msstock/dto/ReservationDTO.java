package com.wzzy.library.msstock.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDTO {

    private Long reservationIdDTO;
    private Long customerIdDTO;
    private Long bookIdDTO;
    private Long orderIdDTO;
    private Integer reservedQuantityDTO;
    private LocalDateTime reservationDateDTO;
    private LocalDateTime expiryDateDTO;
    private String statusDTO;
}
