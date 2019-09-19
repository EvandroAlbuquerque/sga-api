package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.Volunteer;
import com.albuquerque.sgaapi.repositories.VolunteerRepository;
import com.albuquerque.sgaapi.services.VolunteerService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/volunteer/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class VolunteerController {

    VolunteerService service;

    @PostMapping("/new/")
    public Volunteer newVolunteer(@RequestBody Volunteer newVolunteer) {
        return service.save(newVolunteer);
    }

    @PutMapping("/{id}/")
    public Volunteer editVolunteer(@PathVariable Long id, @RequestBody Volunteer editedVolunteer) {
        return service.edit(id, editedVolunteer);
    }

    @GetMapping("/{id}/")
    public ResponseEntity<Volunteer> viewVolunteer(@PathVariable Long id) {
        return ResponseEntity.of(service.find(id));
    }

    @DeleteMapping("/{id}/")
    public void deleteVolunteer(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public Page<Volunteer> allVolunteers(Pageable pageable) {
        return service.findAll(pageable);
    }
}
