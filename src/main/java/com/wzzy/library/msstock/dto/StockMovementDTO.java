package com.wzzy.library.msstock.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockMovementDTO {

    private Long id;
    private Long stockItemId;
    private String movementType;
    private Integer quantity;
    private String reason;
    private LocalDateTime date;
    private Long userId;
}
