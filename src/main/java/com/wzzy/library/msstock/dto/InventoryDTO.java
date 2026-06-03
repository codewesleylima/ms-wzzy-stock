package com.wzzy.library.msstock.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryDTO {

    private UUID inventoryIdDTO;
    private String warehouseNameDTO;
    private String locationDTO;
    private String statusDTO;
    private List<StockItemDTO> stockItemsDTO;
    private List<StockMovementDTO> stockMovementsDTO;
    private List<ReservationDTO> reservationsDTO;
    private LocalDateTime createdAtDTO;
    private LocalDateTime updatedAtDTO;
}
