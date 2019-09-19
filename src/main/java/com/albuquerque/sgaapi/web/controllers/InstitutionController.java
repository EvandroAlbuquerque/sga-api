package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.Institution;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/institution/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class InstitutionController {

    @PostMapping("/new/")
    public ResponseEntity newInstitution(@RequestBody Institution newInstitution) {

    }

    @PutMapping("/{id}/")
    public ResponseEntity editInstitution(@PathVariable Long id, @RequestBody Institution editedInstitution) {

    }

    @GetMapping("{id}")
    public ResponseEntity viewInstitution(@PathVariable Long id) {

    }

    @GetMapping
    public ResponseEntity allInstitutions() {

    }
}
