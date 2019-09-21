package com.albuquerque.sgaapi.repositories.donation;

import com.albuquerque.sgaapi.entities.donation.Money;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyRepository extends JpaRepository<Money, Long> {
}
