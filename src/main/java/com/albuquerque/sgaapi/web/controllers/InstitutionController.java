package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.Institution;
import com.albuquerque.sgaapi.services.InstitutionService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CRUD Institutions

@RestController
@RequestMapping("/api/institution")
@RequiredArgsConstructor
public class InstitutionController {

    private final InstitutionService service;

    @PostMapping("/new")
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
    public Institution createInstitution(@RequestBody Institution newInstitution) {
        return service.save(newInstitution);
    }

    @PutMapping("/{id}")
    public Institution editInstitution(@PathVariable Long id, @RequestBody Institution editedInstitution) {
        return service.edit(id, editedInstitution);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Institution> viewInstitution(@PathVariable Long id) {
        return ResponseEntity.of(service.find(id));
    }

    @DeleteMapping("/{id}")
    public void deleteInstitution(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<Institution> allInstitutions() {
        return service.findAll();
    }
}
