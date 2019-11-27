package com.albuquerque.sgaapi.repositories;

import com.albuquerque.sgaapi.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
