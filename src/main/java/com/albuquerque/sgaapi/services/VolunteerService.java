package com.albuquerque.sgaapi.services;

import com.albuquerque.sgaapi.entities.Address;
import com.albuquerque.sgaapi.entities.Contact;
import com.albuquerque.sgaapi.entities.Volunteer;
import com.albuquerque.sgaapi.repositories.VolunteerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VolunteerService {

    VolunteerRepository repository;

    public Volunteer save(Volunteer newVolunteer) {
        return repository.save(newVolunteer);
    }

    public Volunteer editName(Long id, String nameVolunteer) {
        Volunteer volunteer = repository.findById(id).get();

        volunteer.setName(nameVolunteer);
        return repository.save(volunteer);
    }

    public Volunteer editAdress(Long id, Address newAddress) {
        Volunteer volunteer = repository.findById(id).get();

        volunteer.setAddress(newAddress);
        return repository.save(volunteer);
    }

    public Volunteer editContact(Long id, Contact newContacts) {
        Volunteer volunteer = repository.findById(id).get();

        volunteer.setContacts(newContacts);
        return repository.save(volunteer);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Optional<Volunteer> find(Long id) {
        return repository.findById(id);
    }

    public Page<Volunteer> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

}
