package com.albuquerque.sgaapi.repositories;

import com.albuquerque.sgaapi.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
