package com.wzzy.library.msstock.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockMovementDTO {

    private Long stockMovementIdDTO;
    private Long stockItemIdDTO;
    private String movementTypeDTO;
    private Integer quantityDTO;
    private String reasonDTO;
    private LocalDateTime dateDTO;
    private Long userIdDTO;
}
