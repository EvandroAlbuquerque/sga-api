package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.Action;
import com.albuquerque.sgaapi.entities.Address;
//import com.albuquerque.sgaapi.entities.Volunteer;
import com.albuquerque.sgaapi.services.ActionService;
//import com.albuquerque.sgaapi.services.VolunteerService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// Create, Read, Update and Cancel Actions


@RestController
@RequestMapping("/api/action")
@RequiredArgsConstructor
public class ActionController {

    private final ActionService service;

//    private final VolunteerService volunteerService;

//    @Data
//    public static class ActionDTO {
//        Long responsible;
//        Address place;
//        String hour;
//        String obs;
//    }

    @PostMapping("/new")
//    public Action createAction(@RequestBody ActionDTO newAction) {
    public Action createAction(@RequestBody Action newAction) {
        Action action = new Action();
//        Volunteer volunteer = volunteerService.find(newAction.getResponsible()).orElse(null);
        action.setResponsible(newAction.getResponsible());
        action.setHour(newAction.getHour());
        action.setObs(newAction.getObs());
        action.setPlace(newAction.getPlace());
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

    @GetMapping
    public List<Action> activeActions() {
        return service.findAllActive();
    }

    @GetMapping("/historic")
    public List<Action> historicActions(Long id, Address newAdress) {
        return service.findAll();
    }

}
