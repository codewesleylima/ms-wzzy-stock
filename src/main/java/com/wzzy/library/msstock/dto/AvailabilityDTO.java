package com.wzzy.library.msstock.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvailabilityDTO {

    private Long availabilityIdDTO;
    private Long bookIdDTO;
    private String statusDTO;
    private Integer quantityAvailableDTO;
    private LocalDateTime lastCheckedDTO;
}
