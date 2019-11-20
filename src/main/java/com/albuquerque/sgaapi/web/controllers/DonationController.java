package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.donation.*;
import com.albuquerque.sgaapi.services.DonationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/donation")
@RequiredArgsConstructor
public class DonationController {

    private final DonationService service;

    @PostMapping("/add")
    public Donation newDonation(@RequestBody Donation donation) {
        return service.addDonation(donation);
    }

    @GetMapping
    public List<Donation> allDonations() {
        return service.allDonations();
    }

    @PutMapping("/{id}/forwardto/{institutionId}")
    public void forwardDonation(@PathVariable Long id, @PathVariable Long institutionId) {
        service.forwardTo(id, institutionId);
    }

//    @PostMapping("/clothes")
//    public Clothes donateClothes(@RequestBody Clothes clothes) {
//        return service.addClothes(clothes);
//    }
//    @GetMapping("/clothes")
//    public List<Clothes> allClothes() {
//        return service.allClothes();
//    }
//    @PutMapping("/clothes/{id}")
//    public void forwardClothes(@PathVariable Long id, @RequestBody Long institutionId) {
//        service.forwardClothes(id, institutionId);
//    }
//
//    @PostMapping("/food")
//    public Food donateFood(@RequestBody Food food) {
//        return service.addFood(food);
//    }
//    @GetMapping("/food")
//    public List<Food> allFood() {
//        return service.allFood();
//    }
//    @PutMapping("/food/{id}")
//    public void forwardFood(@PathVariable Long id, @RequestBody Long institutionId) {
//        service.forwardFood(id, institutionId);
//    }
//
//    @PostMapping("/hygieneProduct")
//    public HygieneProduct donateHygieneProduct(@RequestBody HygieneProduct product) {
//        return service.addHygieneProduct(product);
//    }
//    @GetMapping("/hygieneProduct")
//    public List<HygieneProduct> allHygieneProducts() {
//        return service.allHygieneProducts();
//    }
//    @PutMapping("/hygieneProduct/{id}")
//    public void forwardHygieneProduct(@PathVariable Long id, @RequestBody Long institutionId) {
//        service.forwardHygieneProduct(id, institutionId);
//    }
//
//    @PostMapping("/money")
//    public Money donateMoney(@RequestBody Money money) {
//        return service.addMoney(money);
//    }
//    @GetMapping("/money")
//    public List<Money> allMoney() {
//        return service.allMoney();
//    }
//    @PutMapping("/money/{id}")
//    public void forwardMoney(@PathVariable Long id, @RequestBody Long institutionId) {
//        service.forwardMoney(id, institutionId);
//    }
//
//    @PostMapping("/toy")
//    public Toy donateToy(@RequestBody Toy toy) {
//        return service.addToy(toy);
//    }
//    @GetMapping("/toy")
//    public List<Toy> allToys() {
//        return service.allToys();
//    }
//    @PutMapping("/toy/{id}")
//    public void forwardToy(@PathVariable Long id, @RequestBody Long institutionId) {
//        service.forwardToy(id, institutionId);
//    }

}
