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
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class InstitutionController {

    InstitutionService service;

    @PostMapping("/new")
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

    @DeleteMapping("/delete/{id}")

    @GetMapping
    public List<Institution> allInstitutions() {
        return service.findAll();
    }
}
