package com.wzzy.library.msstock.dto;

import com.wzzy.library.msstock.enums.MovementType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockMovementDTO {
    private String id;
    private String stockItemId;
    private String bookId;
    private MovementType movementType;
    private int quantity;
    private String reason;
    private String reference;
    private String createdAt;
    private String processedAt;
}
