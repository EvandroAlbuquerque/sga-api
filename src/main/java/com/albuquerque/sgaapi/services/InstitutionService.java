package com.albuquerque.sgaapi.services;

import com.albuquerque.sgaapi.entities.Institution;
import com.albuquerque.sgaapi.repositories.InstitutionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstitutionService {

    public InstitutionRepository repository;

    public Institution save(Institution newInstitution) {
        return repository.save(newInstitution);
    }

    public Institution edit(Long id, Institution editedInstitution) {
        Institution oldInstitution = repository.findById(id).get();
        editedInstitution.setId(oldInstitution.getId());

        if (editedInstitution.getName() == null) {
            editedInstitution.setName(oldInstitution.getName());
        }
        if (editedInstitution.getAddress() == null) {
            editedInstitution.setAddress(oldInstitution.);
        }
        if (editedInstitution.getContact() == null) {
            editedInstitution.setContact(oldInstitution.getContact());
        }

        return repository.save(editedInstitution);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Optional<Institution> find(Long id) {
        return repository.findById(id);
    }

    public List<Institution> findAll() {
        return repository.findAll();
    }

    public Page<Institution> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
