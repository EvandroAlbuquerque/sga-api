package com.albuquerque.sgaapi.repositories.donation;

import com.albuquerque.sgaapi.entities.Institution;
import com.albuquerque.sgaapi.entities.donation.HygieneProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HygieneProductRepository extends JpaRepository<HygieneProduct, Long> {

    List<HygieneProduct> findAllByForwardedTo(Institution institution);

}
