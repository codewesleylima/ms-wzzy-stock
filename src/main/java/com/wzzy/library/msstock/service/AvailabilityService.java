package com.wzzy.library.msstock.service;

import com.wzzy.library.msstock.dto.AvailabilityDTO;

public interface AvailabilityService {
    AvailabilityDTO getAvailabilityByStockItemId(String stockItemId);
    AvailabilityDTO updateAvailability(String stockItemId, AvailabilityDTO availabilityDTO);
    boolean isBookAvailable(String bookId);
    void updateAvailabilityStatus(String stockItemId);
}
