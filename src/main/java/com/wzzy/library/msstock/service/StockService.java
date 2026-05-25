package com.wzzy.library.msstock.service;

import com.wzzy.library.bfflibrary.dto.PaginationDTO;
import com.wzzy.library.msstock.dto.StockItemDTO;
import com.wzzy.library.msstock.dto.StockMovementDTO;

public interface StockService {
    StockItemDTO createStockItem(StockItemDTO stockItemDTO);
    StockItemDTO getStockItemById(String id);
    StockItemDTO getStockItemByBookId(String bookId);
    StockItemDTO updateStockItem(String id, StockItemDTO stockItemDTO);
    void deleteStockItem(String id);

    StockMovementDTO recordMovement(StockMovementDTO movementDTO);
    PaginationDTO<StockMovementDTO> getMovementHistory(String stockItemId, int page, int size);

    int getAvailableQuantity(String bookId);
    boolean hasStock(String bookId, int requiredQuantity);
    void updateStockQuantity(String bookId, int quantity);
}
