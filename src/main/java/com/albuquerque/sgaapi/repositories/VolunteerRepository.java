package com.albuquerque.sgaapi.repositories;

import com.albuquerque.sgaapi.entities.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
}
