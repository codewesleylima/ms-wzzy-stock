package com.wzzy.library.msstock.entity;

import com.wzzy.library.msstock.enums.ReservationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String customerId;

    @ManyToOne
    @JoinColumn(name = "stock_item_id", nullable = false)
    private StockItem stockItem;

    @Column(nullable = false)
    private String orderId;

    @Column(nullable = false)
    private int reservedQuantity;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private ReservationStatus status = ReservationStatus.PENDING;

    private String reservationCode;

    @Column(name = "reserved_at")
    @Builder.Default
    private LocalDateTime reservedAt = LocalDateTime.now();

    @Column(name = "expires_at")
    private LocalDateTime expiresAt;

    @Column(name = "confirmed_at")
    private LocalDateTime confirmedAt;

    @Column(name = "cancelled_at")
    private LocalDateTime cancelledAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
