package com.albuquerque.sgaapi.services;

import com.albuquerque.sgaapi.entities.Action;
import com.albuquerque.sgaapi.entities.Address;
import com.albuquerque.sgaapi.repositories.ActionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ActionService {

    ActionRepository repository;

    public Action save(Action newAction) {
        return repository.save(newAction);
    }

    public Action edit(Long id, Action editedAction) {
        Action oldAction = repository.findById(id).get();
        editedAction.setId(oldAction.getId());

        if (editedAction.getHour() == null) {
            editedAction.setHour(oldAction.getHour());
        }
        if (editedAction.getMeetingPlace() == null) {
            editedAction.setMeetingPlace(oldAction.getMeetingPlace());
        }
        if (editedAction.getObs() == null) {
            editedAction.setObs(oldAction.getObs());
        }

        return repository.save(editedAction);
    }

    public Action editAddress(Long id, Address newAdress) {

    }

    public void cancel(Long id) {
        repository.;
    }

    public Optional<Action> find(Long id) {
        return repository.findById(id);
    }

    public Page<Action> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

}
