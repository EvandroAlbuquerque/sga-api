package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.NeedyPoint;
import com.albuquerque.sgaapi.services.NeedyPointService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/needypoint")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class NeedyPointController {

    NeedyPointService service;

    @PostMapping("/new")
    public NeedyPoint newNeedyPoint(@RequestBody NeedyPoint newNeedyPoint) {
        return service.save(newNeedyPoint);
    }

    @PutMapping("/{id}")
    public NeedyPoint editNeedyPoint(@PathVariable Long id, @RequestBody NeedyPoint editedNeedyPoint) {
        return service.edit(id, editedNeedyPoint);
    }

    @GetMapping("/{id}")
    public ResponseEntity viewNeedyPoint(@PathVariable Long id) {
        return ResponseEntity.of(service.find(id));
    }

    @DeleteMapping("/{id}")
    public void deleteNeedPoint(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<NeedyPoint> allNeedyPoints() {
        return service.findAll();
    }
}
