package com.wzzy.library.msstock.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "stock_movements")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "stock_item_id", nullable = false)
    private StockItem stockItem;

    @Column(nullable = false)
    private String movementType;

    @Column(nullable = false)
    private Integer quantity;

    private String reason;

    @Column(nullable = false)
    private LocalDateTime date = LocalDateTime.now();

    private Long userId;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
