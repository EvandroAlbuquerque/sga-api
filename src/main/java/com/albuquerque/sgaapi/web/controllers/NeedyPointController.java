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
@RequiredArgsConstructor
public class NeedyPointController {

    private final NeedyPointService service;

    @PostMapping("/new")
    public NeedyPoint newNeedyPoint(@RequestBody NeedyPoint newNeedyPoint) {
        return service.save(newNeedyPoint);
    }

    @PutMapping("/{id}")
    public NeedyPoint editNeedyPoint(@PathVariable Long id, @RequestBody NeedyPoint editedNeedyPoint) {
        NeedyPoint oldNeedyPoint = service.find(id).get();
        editedNeedyPoint.setId(id);

        if (editedNeedyPoint.getDescription() == null) {
            editedNeedyPoint.setDescription(oldNeedyPoint.getDescription());
        }
        if (editedNeedyPoint.getObs() == null) {
            editedNeedyPoint.setObs(oldNeedyPoint.getObs());
        }
        if (editedNeedyPoint.getAddress() == null) {
            editedNeedyPoint.setAddress(oldNeedyPoint.getAddress());
        }
        if (editedNeedyPoint.getMostNeeds() == null) {
            editedNeedyPoint.setMostNeeds(oldNeedyPoint.getMostNeeds());
        }

        return service.save(editedNeedyPoint);
    }

    @GetMapping("/{id}")
    public ResponseEntity viewNeedyPoint(@PathVariable Long id) {
        return ResponseEntity.of(service.find(id));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteNeedPoint(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<NeedyPoint> allNeedyPoints() {
        return service.findAll();
    }
}
