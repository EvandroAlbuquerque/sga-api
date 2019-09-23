package com.albuquerque.sgaapi.services;

import com.albuquerque.sgaapi.entities.NeedyPoint;
import com.albuquerque.sgaapi.repositories.NeedyPointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NeedyPointService {

    NeedyPointRepository repository;

    public NeedyPoint save(NeedyPoint newNeedyPoint) {
        return repository.save(newNeedyPoint);
    }

    public NeedyPoint edit(Long id, NeedyPoint editedNeedyPoint) {
        NeedyPoint oldNeedyPoint = repository.findById(id).get();
        editedNeedyPoint.setId(oldNeedyPoint.getId());

        if (editedNeedyPoint.getDescription() == null) {
            editedNeedyPoint.setDescription(oldNeedyPoint.getDescription());
        }
        if (editedNeedyPoint.getMostNeeds().isEmpty()) {
            editedNeedyPoint.getMostNeeds().addAll(oldNeedyPoint.getMostNeeds());
        }
        if (editedNeedyPoint.getObs() == null) {
            editedNeedyPoint.setObs(oldNeedyPoint.getObs());
        }
        if (editedNeedyPoint.getAddress() == null) {
            editedNeedyPoint.setAddress(oldNeedyPoint.getAddress());
        }

        return repository.save(editedNeedyPoint);
    }

    public Optional<NeedyPoint> find(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<NeedyPoint> findAll() {
        return repository.findAll();
    }
}
