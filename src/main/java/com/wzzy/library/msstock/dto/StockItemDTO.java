package com.wzzy.library.msstock.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockItemDTO {

    private Long id;
    private Long bookId;
    private Integer quantity;
    private Integer reorderLevel;
    private String warehouseLocation;
    private LocalDateTime lastUpdated;
}
