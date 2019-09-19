package com.albuquerque.sgaapi.services;

import com.albuquerque.sgaapi.entities.donation.PersonalHygiene;
import com.albuquerque.sgaapi.repositories.PersonalHygieneRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonalHygieneService {

    private final PersonalHygieneRepository repository;

    public PersonalHygiene save(PersonalHygiene newPersonalHygiene) {
        return repository.save(newPersonalHygiene);
    }

    public PersonalHygiene edit(Long id, PersonalHygiene editedPersonalHygiene) {
        Optional<PersonalHygiene> oldPersonalHygiene = repository.findById(id);
        editedPersonalHygiene.setId(oldPersonalHygiene.getId());

        if (editedPersonalHygiene.getDescription() = null) {
            editedPersonalHygiene.setDescription(oldPersonalHygiene.getDescription());
        }
        if (editedPersonalHygiene)
    }
}
