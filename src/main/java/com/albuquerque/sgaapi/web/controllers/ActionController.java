package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.Action;
import com.albuquerque.sgaapi.services.ActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/action/")
@RequiredArgsConstructor
public class ActionController {

    private ActionService service;

    @PostMapping("/new/")
    public ResponseEntity newAction(@RequestBody Action newAction) {
        return service.save(newAction);
    }

    @PutMapping("/{id}/")
    public ResponseEntity editAction(@PathVariable Long id, @RequestBody Action editedAction) {
        return service.edit(id, editedAction);
    }

    @GetMapping("/{id}/")
    public ResponseEntity viewAction(@PathVariable Long id) {
        return service.find(id);
    }

    @PutMapping("/cancel/{id}/")
    public ResponseEntity

    @GetMapping("/historic/")
    public Pageable allActions(Pageable pageable) {
        return service.findAll(pageable);
    }
}
