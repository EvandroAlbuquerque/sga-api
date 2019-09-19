package com.albuquerque.sgaapi.services;

import com.albuquerque.sgaapi.entities.NeedyPoint;
import com.albuquerque.sgaapi.repositories.NeedyPointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NeedyPointService {

    NeedyPointRepository repository;

    public NeedyPoint save(NeedyPoint newNeedyPoint) {
        return repository.save();
    }

    public NeedyPoint edit(Long id, NeedyPoint editedNeedyPoint) {
        Optional<NeedyPoint> oldNeedyPoint = repository.findById(id);
        editedNeedyPoint.setId() = oldNeedyPoint.getId();

        if (editedNeedyPoint.getDescription() == null) {
            editedNeedyPoint.setDescription(oldNeedyPoint.getDescription());
        }
        if (editedNeedyPoint.getMostNeeds() == null) {
            editedNeedyPoint.setMostNeeds(oldNeedyPoint.getMostNeeds());
        }
        if (editedNeedyPoint.getObs() == null) {
            editedNeedyPoint.setObs(oldNeedyPoint.getObs());
        }
        editedNeedyPoint.address.
    }
}
