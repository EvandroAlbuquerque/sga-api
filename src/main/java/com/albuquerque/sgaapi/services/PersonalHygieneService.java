package com.albuquerque.sgaapi.services;

import com.albuquerque.sgaapi.entities.donation.HygieneProduct;
import com.albuquerque.sgaapi.repositories.PersonalHygieneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonalHygieneService {

    private final PersonalHygieneRepository repository;

    public HygieneProduct save(HygieneProduct newHygieneProduct) {
        return repository.save(newHygieneProduct);
    }

    public HygieneProduct edit(Long id, HygieneProduct editedHygieneProduct) {
        Optional<HygieneProduct> oldPersonalHygiene = repository.findById(id);
        editedHygieneProduct.setId(oldPersonalHygiene.getId());

        if (editedHygieneProduct.getDescription() = null) {
            editedHygieneProduct.setDescription(oldPersonalHygiene.getDescription());
        }
        if (editedHygieneProduct)
    }
}
