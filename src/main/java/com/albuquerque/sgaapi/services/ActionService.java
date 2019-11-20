package com.albuquerque.sgaapi.services;

import com.albuquerque.sgaapi.entities.Action;
import com.albuquerque.sgaapi.repositories.ActionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ActionService {

    private final ActionRepository repository;

    public Action save(Action newAction) {
        return repository.save(newAction);
    }

    public Action edit(Long id, Action editedAction) {
        Action oldAction = repository.findById(id).get();
        editedAction.setId(oldAction.getId());

        if (editedAction.getHour() == null) {
            editedAction.setHour(oldAction.getHour());
        }
        if (editedAction.getAddress() == null) {
            editedAction.setAddress(oldAction.getAddress());
        }
        if (editedAction.getObs() == null) {
            editedAction.setObs(oldAction.getObs());
        }

        return repository.save(editedAction);
    }

//    public Action editAddress(Long id, Address newAdress) {
//        Action action = repository.findById(id).orElse(null);
//        action.setMeetingPlace(newAdress);
//        return repository.save(action);
//    }

    public Action cancel(Long id) {
        Action action = repository.findById(id).orElse(null);
        action.setScheduled(false);
        return repository.save(action);
    }

    public Optional<Action> find(Long id) {
        return repository.findById(id);
    }

    public List<Action> findAllActive() {
        return repository.findAllByScheduled(true);
    }

    public List<Action> findAll() {
        return repository.findAll();
    }

    public Page<Action> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

}
