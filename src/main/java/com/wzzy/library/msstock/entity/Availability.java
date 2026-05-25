package com.wzzy.library.msstock.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "availability")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @OneToOne
    @JoinColumn(name = "stock_item_id", nullable = false)
    private StockItem stockItem;

    @Column(nullable = false)
    private boolean isAvailable;

    private LocalDateTime nextAvailableDate;
    private String estimatedRestockDate;
    private String availabilityNotes;

    @Column(name = "updated_at")
    @Builder.Default
    private LocalDateTime updatedAt = LocalDateTime.now();
}
