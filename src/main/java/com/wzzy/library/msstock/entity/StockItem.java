package com.wzzy.library.msstock.entity;

import com.wzzy.library.msstock.enums.AvailabilityStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "stock_items")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true, nullable = false)
    private String bookId;

    @Column(nullable = false)
    private String bookTitle;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private int reservedQuantity;

    @Column(nullable = false)
    private int availableQuantity;

    @Column(nullable = false)
    private int minimumStockLevel;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private AvailabilityStatus status = AvailabilityStatus.AVAILABLE;

    private String warehouseLocation;
    private String barcode;

    @Column(name = "last_restock_date")
    private LocalDateTime lastRestockDate;

    @Column(name = "created_at")
    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
