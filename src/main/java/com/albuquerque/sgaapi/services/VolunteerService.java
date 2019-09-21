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

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VolunteerService {

    VolunteerRepository repository;

    public Volunteer save(Volunteer newVolunteer) {
        return repository.save(newVolunteer);
    }

    public Volunteer edit(Long id, Volunteer editedVolunteer) {
        Volunteer oldVolunteer = repository.findById(id).get();

        editedVolunteer.setId(oldVolunteer.getId());

        if (editedVolunteer.getName() == null) {
            editedVolunteer.setName(oldVolunteer.getName());
        }
        if (editedVolunteer.getAddress() == null) {
            editedVolunteer.setAddress(oldVolunteer.getAddress());
        }
        if (editedVolunteer.getContacts() == null) {
            editedVolunteer.setContacts(oldVolunteer.getContacts());
        }

        return repository.save(editedVolunteer);
    }

//    public Volunteer editName(Long id, String nameVolunteer) {
//        Volunteer volunteer = repository.findById(id).get();
//
//        volunteer.setName(nameVolunteer);
//        return repository.save(volunteer);
//    }

//    public Volunteer editAdress(Long id, Address newAddress) {
//        Volunteer volunteer = repository.findById(id).get();
//
//        volunteer.setAddress(newAddress);
//        return repository.save(volunteer);
//    }
//
//    public Volunteer editContact(Long id, Contact newContacts) {
//        Volunteer volunteer = repository.findById(id).get();
//
//        volunteer.setContacts(newContacts);
//        return repository.save(volunteer);
//    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Optional<Volunteer> find(Long id) {
        return repository.findById(id);
    }

    public List<Volunteer> findAll() {
        return repository.findAll();
    }

    public Page<Volunteer> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

}
