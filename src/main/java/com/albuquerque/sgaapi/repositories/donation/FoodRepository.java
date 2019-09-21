package com.albuquerque.sgaapi.repositories.donation;

import com.albuquerque.sgaapi.entities.donation.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
