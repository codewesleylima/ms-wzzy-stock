package com.wzzy.library.msstock.repository;

import com.wzzy.library.msstock.entity.StockMovement;
import com.wzzy.library.msstock.enums.MovementType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface StockMovementRepository extends JpaRepository<StockMovement, String> {
    List<StockMovement> findByStockItemId(String stockItemId);
    List<StockMovement> findByMovementType(MovementType movementType);
    List<StockMovement> findByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate);
    List<StockMovement> findByStockItemIdAndMovementType(String stockItemId, MovementType movementType);
}
