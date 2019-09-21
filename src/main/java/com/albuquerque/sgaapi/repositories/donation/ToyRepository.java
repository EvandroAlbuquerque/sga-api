package com.albuquerque.sgaapi.repositories.donation;

import com.albuquerque.sgaapi.entities.donation.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyRepository extends JpaRepository<Toy, Long> {
}
