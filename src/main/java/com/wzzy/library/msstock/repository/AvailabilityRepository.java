package com.wzzy.library.msstock.repository;

import com.wzzy.library.msstock.entity.Availability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AvailabilityRepository extends JpaRepository<Availability, String> {
    Optional<Availability> findByStockItemId(String stockItemId);
}
