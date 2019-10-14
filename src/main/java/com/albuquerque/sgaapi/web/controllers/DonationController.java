package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.donation.*;
import com.albuquerque.sgaapi.services.DonationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donation/")
@RequiredArgsConstructor
public class DonationController {

    private final DonationService service;

    @PostMapping("/clothes")
    public Clothes donateClothes(@RequestBody Clothes clothes) {
        return service.addClothes(clothes);
    }
    @GetMapping("/clothes")
    public List<Clothes> allClothes() {
        return service.allClothes();
    }
    @DeleteMapping("/clothes/{id}")
    public void removeClothes(@PathVariable Long id) {
        service.removeClothes(id);
    }

    @PostMapping("/food")
    public Food donateFood(@RequestBody Food food) {
        return service.addFood(food);
    }
    @GetMapping("/food")
    public List<Food> allFood() {
        return service.allFood();
    }
    @DeleteMapping("/food/{id}")
    public void removeFood(@PathVariable Long id) {
        service.removeFood(id);
    }

    @PostMapping("/hygieneProduct")
    public HygieneProduct donateHygieneProduct(@RequestBody HygieneProduct product) {
        return service.addHygieneProduct(product);
    }
    @GetMapping("/hygieneProduct")
    public List<HygieneProduct> allHygieneProducts() {
        return service.allHygieneProducts();
    }
    @DeleteMapping("/hygieneProduct/{id}")
    public void removeHygieneProduct(@PathVariable Long id) {
        service.removeHygieneProduct(id);
    }

    @PostMapping("/money")
    public Money donateMoney(@RequestBody Money money) {
        return service.addMoneyDonation(money);
    }
    @GetMapping("/money")
    public List<Money> allMoneyDonations() {
        return service.allMoneyDonations();
    }
    @DeleteMapping("/money/{id}")
    public void removeMoneyDonation(@PathVariable Long id) {
        service.removeMoneyDonation(id);
    }

    @PostMapping("/toy")
    public Toy donateToy(@RequestBody Toy toy) {
        return service.addToy(toy);
    }
    @GetMapping("/toy")
    public List<Toy> allToys() {
        return service.allToys();
    }
    @DeleteMapping("/toy/{id}")
    public void removeToy(@PathVariable Long id) {
        service.removeToy(id);
    }
}
