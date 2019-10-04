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

    private final VolunteerRepository repository;

    public Volunteer save(Volunteer newVolunteer) {
        return repository.save(newVolunteer);
    }

    public Volunteer edit(Long id, Volunteer editedVolunteer) {
        Volunteer oldVolunteer = repository.findById(id).get();

        editedVolunteer.setId(oldVolunteer.getId());

        if (editedVolunteer.getName() == null) {
            editedVolunteer.setName(oldVolunteer.getName());
        }
        if (editedVolunteer.getAddress() != null) {
            if (editedVolunteer.getAddress().getPostalCode() == null) {
                editedVolunteer.getAddress().setPostalCode(oldVolunteer.getAddress().getPostalCode());
            }
            if (editedVolunteer.getAddress().getStreet() == null) {
                editedVolunteer.getAddress().setStreet(oldVolunteer.getAddress().getStreet());
            }
            if (editedVolunteer.getAddress().getNumber() == 0) {
                editedVolunteer.getAddress().setNumber(oldVolunteer.getAddress().getNumber());
            }
            if (editedVolunteer.getAddress().getDistrict() == null) {
                editedVolunteer.getAddress().setDistrict(oldVolunteer.getAddress().getDistrict());
            }
        }
        else {
            editedVolunteer.setAddress(oldVolunteer.getAddress());
        }
        if (editedVolunteer.getContact() != null) {
            if (editedVolunteer.getContact().getEmail() == null) {
                editedVolunteer.getContact().setEmail(oldVolunteer.getContact().getEmail());
            }
            if (editedVolunteer.getContact().getPhone() == null) {
                editedVolunteer.getContact().setPhone(oldVolunteer.getContact().getPhone());
            }
        }
        else {
            editedVolunteer.setContact(oldVolunteer.getContact());
        }

        return repository.save(editedVolunteer);
    }

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
