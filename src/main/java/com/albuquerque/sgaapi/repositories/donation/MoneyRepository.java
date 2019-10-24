package com.albuquerque.sgaapi.repositories.donation;

import com.albuquerque.sgaapi.entities.Institution;
import com.albuquerque.sgaapi.entities.donation.Money;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MoneyRepository extends JpaRepository<Money, Long> {

    List<Money> findAllByForwardedTo(Institution institution);

}
