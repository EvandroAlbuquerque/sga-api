package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.Address;
import com.albuquerque.sgaapi.entities.Contact;
import com.albuquerque.sgaapi.entities.Institution;
import com.albuquerque.sgaapi.entities.Volunteer;
import com.albuquerque.sgaapi.services.InstitutionService;
import com.albuquerque.sgaapi.services.VolunteerService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CRUD Institutions

@CrossOrigin
@RestController
@RequestMapping("/api/institution")
@RequiredArgsConstructor
public class InstitutionController {

    private final InstitutionService service;

    private final VolunteerService volunteerService;

    @Data
    public static class InstitutionDTO {
        Long responsible;
        String name;
        String initials;
        String description;
        Address address;
        Contact contact;

    }

    @PostMapping("/add")
    public Institution createInstitution(@RequestBody InstitutionDTO newInstitution) {
        Institution institution = new Institution();
        institution.setName(newInstitution.getName());
        institution.setInitials(newInstitution.getInitials());
        institution.setDescription(newInstitution.getDescription());
        Volunteer responsible = volunteerService.find(newInstitution.getResponsible()).orElse(null);
        institution.setAddress(newInstitution.getAddress());
        institution.setContact(newInstitution.getContact());
        return service.save(institution);
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
