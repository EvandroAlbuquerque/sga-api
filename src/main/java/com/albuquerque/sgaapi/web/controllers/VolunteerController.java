package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.Volunteer;
import com.albuquerque.sgaapi.services.VolunteerService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/volunteer")
@RequiredArgsConstructor
public class VolunteerController {

    private final VolunteerService service;

    @PostMapping("/add")
    public Volunteer newVolunteer(@RequestBody Volunteer newVolunteer) {
        return service.save(newVolunteer);
    }

//    @PutMapping("/{id}")
//    public Volunteer editVolunteer(@PathVariable Long id, @RequestBody Volunteer editedVolunteer) {
//        return service.edit(id, editedVolunteer);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Volunteer> viewVolunteer(@PathVariable Long id) {
//        return ResponseEntity.of(service.find(id));
//    }
//
    @DeleteMapping("/delete")
    public void deleteVolunteer(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<Volunteer> allVolunteers(){
        return service.findAll();
    }

//    @GetMapping
//    public Page<Volunteer> allVolunteers(Pageable pageable) {
//        return service.findAll(pageable);
//    }
}
