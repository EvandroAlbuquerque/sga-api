package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.Address;
import com.albuquerque.sgaapi.entities.Contact;
import com.albuquerque.sgaapi.entities.Volunteer;
import com.albuquerque.sgaapi.services.AddressService;
import com.albuquerque.sgaapi.services.ContactService;
import com.albuquerque.sgaapi.services.VolunteerService;
import lombok.AccessLevel;
import lombok.Data;
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

    private final AddressService addressService;
    private final ContactService contactService;

    @Data
    public static class VolunteerDTO {
        String name;
        Contact contact;
        Address address;
    }

    @PostMapping("/add")
    public Volunteer newVolunteer(@RequestBody VolunteerDTO newVolunteer) {
        Volunteer volunteer = new Volunteer();
        volunteer.setName(newVolunteer.getName());
        Contact contact = contactService.save(newVolunteer.getContact());
        volunteer.setContact(contact);
        Address address = addressService.save(newVolunteer.getAddress());
        volunteer.setAddress(address);
        return service.save(volunteer);
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
    @DeleteMapping("/delete/{id}")
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
