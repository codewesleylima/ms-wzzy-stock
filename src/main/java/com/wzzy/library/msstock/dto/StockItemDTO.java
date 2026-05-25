package com.wzzy.library.msstock.dto;

import com.wzzy.library.msstock.enums.AvailabilityStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockItemDTO {
    private String id;
    private String bookId;
    private String bookTitle;
    private int quantity;
    private int reservedQuantity;
    private int availableQuantity;
    private int minimumStockLevel;
    private AvailabilityStatus status;
    private String warehouseLocation;
    private String barcode;
    private String lastRestockDate;
    private String createdAt;
    private String updatedAt;
}
