package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.NeedyPoint;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@RestController
@RequestMapping("/api/needypoint/")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class NeedyPointController {

    @PostMapping("/new/")
    public ResponseEntity newNeedyPoint(@RequestBody NeedyPoint newNeedyPoint) {

    }

    @PutMapping("{id}/")
    public ResponseEntity editNeedyPoint(@PathVariable Long id, @RequestBody NeedyPoint editedNeedyPoint) {

    }

    @GetMapping("{id}/")
    public ResponseEntity viewNeedyPoint(@PathVariable Long id) {

    }

    @GetMapping
    public Pageable allNeedyPoints() {

    }
}
