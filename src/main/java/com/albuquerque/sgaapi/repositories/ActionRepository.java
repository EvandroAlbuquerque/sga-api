package com.albuquerque.sgaapi.repositories;

import com.albuquerque.sgaapi.entities.Action;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActionRepository extends JpaRepository<Action, Long> {

//    List<Action> findAllByScheduled(boolean scheduled);

}
