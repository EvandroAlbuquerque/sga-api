package com.albuquerque.sgaapi.web.controllers;

import com.albuquerque.sgaapi.entities.donation.*;
import com.albuquerque.sgaapi.services.DonationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donation/")
public class DonationController {

    DonationService service;

    @PostMapping("/add/clothes")
    public Clothes donateClothes(@RequestBody Clothes clothes) {
        return service.addClothes(clothes);
    }
    @GetMapping("/all/clothes")
    public List<Clothes> allClothes() {
        return service.allClothes();
    }
    @PutMapping("/remove/clothes/{id}")
    public void removeClothes(@PathVariable Long id) {
        service.removeClothes(id);
    }

    @PostMapping("/add/food")
    public Food donateFood(@RequestBody Food food) {
        return service.addFood(food);
    }
    @GetMapping("/all/food")
    public List<Food> allFood() {
        return service.allFood();
    }
    @PutMapping("/remove/food/{id}")
    public void removeFood(@PathVariable Long id) {
        service.removeFood(id);
    }

    @PostMapping("/add/hygieneProduct")
    public HygieneProduct donateHygieneProduct(@RequestBody HygieneProduct product) {
        return service.addHygieneProduct(product);
    }
    @GetMapping("/all/hygieneProduct")
    public List<HygieneProduct> allHygieneProducts() {
        return service.allHygieneProducts();
    }
    @PutMapping("/remove/hygieneProduct/{id}")
    public void removeHygieneProduct(@PathVariable Long id) {
        service.removeHygieneProduct(id);
    }

    @PostMapping("/add/money")
    public Money donateMoney(@RequestBody Money money) {
        return service.addMoneyDonation(money);
    }
    @GetMapping("/all/money")
    public List<Money> allMoneyDonations() {
        return service.allMoneyDonations();
    }
    @PutMapping("/remove/money/{id}")
    public void removeMoneyDonation(@PathVariable Long id) {
        service.removeMoneyDonation(id);
    }

    @PostMapping("/add/toy")
    public Toy donateToy(@RequestBody Toy toy) {
        return service.addToy(toy);
    }
    @GetMapping("/all/toy")
    public List<Toy> allToys() {
        return service.allToys();
    }
    @PutMapping("/remove/toy/{id}")
    public void removeToy(@PathVariable Long id) {
        service.removeToy(id);
    }
}
