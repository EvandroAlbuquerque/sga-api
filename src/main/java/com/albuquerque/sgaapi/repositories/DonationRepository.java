package com.albuquerque.sgaapi.repositories;

import com.albuquerque.sgaapi.entities.donation.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}
