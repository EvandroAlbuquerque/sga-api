package com.albuquerque.sgaapi.services;

import com.albuquerque.sgaapi.entities.Institution;
import com.albuquerque.sgaapi.repositories.InstitutionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstitutionService {

    public InstitutionRepository repository;

    public Institution edit(Long id, Institution editedInstitution) {
        Optional<Institution> oldInstitution = repository.findById(id);
        editedInstitution.setId(oldInstitution.getId());

        if (editedInstitution.getName() == null) {
            editedInstitution.setName(oldInstitution.getName());
        }
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Optional<Institution> find(Long id) {
        return repository.findById(id);
    }

    public Page<Institution> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
