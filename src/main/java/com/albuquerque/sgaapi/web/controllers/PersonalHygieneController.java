package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.donation.PersonalHygiene;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/personalhygiene/")
public class PersonalHygieneController {

    @PostMapping("/new/")
    public ResponseEntity newPersonalHygieneProduct (@RequestBody PersonalHygiene personalHygiene) {

    }

    @PutMapping("/{id}/")
    public ResponseEntity editPersonalHygieneProduct (@PathVariable Long id, @RequestBody PersonalHygiene editedPersonalHygiene) {

    }

    @GetMapping("/{id}/")
    public ResponseEntity viewPersonalHygieneProduct (@PathVariable Long id) {

    }

    @GetMapping
    public ResponseEntity allPersonalHygieneProducts ()
}
