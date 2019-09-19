package com.albuquerque.sgaapi.repositories;

import com.albuquerque.sgaapi.entities.Action;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ActionRepository extends JpaRepository<Action, Long> {

}
