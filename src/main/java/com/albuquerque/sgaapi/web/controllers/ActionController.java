package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.Action;
import com.albuquerque.sgaapi.entities.Address;
import com.albuquerque.sgaapi.entities.Volunteer;
import com.albuquerque.sgaapi.services.ActionService;
import com.albuquerque.sgaapi.services.VolunteerService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


// Create, Read, Update and Cancel Actions


@RestController
@RequestMapping("/api/action")
@RequiredArgsConstructor
public class ActionController {

    private ActionService service;

    private VolunteerService volunteerService;

    @Data
    public static class ActionDTO {
        Long volunteer;
        Address meetingPlace;
        LocalDateTime hour;
        String obs;
    }

    @PostMapping("/new")
    public Action createAction(@RequestBody ActionDTO newAction) {
        Action action = new Action();
        Volunteer volunteer = volunteerService.find(newAction.getVolunteer()).orElse(null);
        action.setResponsible(volunteer);
        action.setMeetingPlace(newAction.getMeetingPlace());
        action.setHour(newAction.getHour());
        action.setObs(newAction.getObs());
        return service.save(action);
    }

    @PutMapping("/{id}")
    public Action editAction(@PathVariable Long id, @RequestBody Action editedAction) {
        return service.edit(id, editedAction);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Action> viewAction(@PathVariable Long id) {
        return ResponseEntity.of(service.find(id));
    }

    @PutMapping("/cancel/{id}")
    public Action cancelAction(@PathVariable Long id) {
        return service.cancel(id);
    }

    @GetMapping("/historic")    public Action editAddress(Long id, Address newAdress) {
        Action action = service.find(id).orElse(null);
        action.setMeetingPlace(newAdress);
        return service.save(action);
    }
    public List<Action> allActions() {
        return service.findAll();
    }
}
