package com.albuquerque.sgaapi.repositories.donation;

import com.albuquerque.sgaapi.entities.donation.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothesRepository extends JpaRepository<Clothes, Long> {
}
