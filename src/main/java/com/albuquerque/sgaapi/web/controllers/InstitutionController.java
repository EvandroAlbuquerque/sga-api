package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.Address;
import com.albuquerque.sgaapi.entities.Contact;
import com.albuquerque.sgaapi.entities.Institution;
import com.albuquerque.sgaapi.services.AddressService;
import com.albuquerque.sgaapi.services.ContactService;
import com.albuquerque.sgaapi.services.InstitutionService;
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

    private final AddressService addressService;
    private final ContactService contactService;

    @Data
    public static class InstitutionDTO {
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
        Address address = addressService.save(newInstitution.getAddress());
        institution.setAddress(address);
        Contact contact = contactService.save(newInstitution.getContact());
        institution.setContact(contact);
        return service.save(institution);
    }

    @GetMapping
    public List<Institution> allInstitutions() {
        return service.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteInstitution(@PathVariable Long id) {
        service.delete(id);
    }

//    @PutMapping("/{id}")
//    public Institution editInstitution(@PathVariable Long id, @RequestBody Institution editedInstitution) {
//        return service.edit(id, editedInstitution);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Institution> viewInstitution(@PathVariable Long id) {
//        return ResponseEntity.of(service.find(id));
//    }

}
