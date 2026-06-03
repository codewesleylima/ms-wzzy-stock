package com.wzzy.library.msstock.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "stock_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockItemIdEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inventory_id")
    private InventoryEntity inventoryEntity;

    @Column(nullable = false, unique = true)
    private Long bookIdEntity;

    @Column(nullable = false)
    private Integer quantityEntity;

    @Column(nullable = false)
    private Integer reorderLevelEntity;

    private String warehouseLocationEntity;

    @Column(nullable = false)
    private LocalDateTime lastUpdatedEntity = LocalDateTime.now();

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAtEntity = LocalDateTime.now();
}
