package com.wzzy.library.msstock.repository;

import com.wzzy.library.msstock.entity.StockItem;
import com.wzzy.library.msstock.enums.AvailabilityStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StockItemRepository extends JpaRepository<StockItem, String> {
    Optional<StockItem> findByBookId(String bookId);
    List<StockItem> findByStatus(AvailabilityStatus status);
    List<StockItem> findByAvailableQuantityLessThan(int minimumLevel);
    List<StockItem> findByQuantityLessThanMinimumStockLevel();
}
