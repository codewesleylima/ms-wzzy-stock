package com.wzzy.library.msstock.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockItemDTO {

    private Long stockItemIdDTO;
    private InventoryDTO inventoryDTO;
    private Long bookIdDTO;
    private Integer quantityDTO;
    private Integer reorderLevelDTO;
    private String warehouseLocationDTO;
    private LocalDateTime lastUpdatedDTO;
    private LocalDateTime createdAtDTO;
    private LocalDateTime updatedAtDTO;
}
