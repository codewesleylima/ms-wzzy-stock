package com.wzzy.library.msstock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AvailabilityDTO {
    private String id;
    private String stockItemId;
    private String bookId;
    private boolean isAvailable;
    private String nextAvailableDate;
    private String estimatedRestockDate;
    private String availabilityNotes;
    private String updatedAt;
}
