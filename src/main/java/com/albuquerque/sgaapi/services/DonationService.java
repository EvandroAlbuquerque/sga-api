package com.albuquerque.sgaapi.services;

import com.albuquerque.sgaapi.entities.donation.*;
import com.albuquerque.sgaapi.repositories.donation.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonationService {

    ClothesRepository        clothesRepository;
    FoodRepository           foodRepository;
    HygieneProductRepository hygieneProductRepository;
    MoneyRepository          moneyRepository;
    ToyRepository            toyRepository;

    public Clothes addClothes(Clothes clothes) {
        return clothesRepository.save(clothes);
    }
    public List<Clothes> allClothes() {
        return clothesRepository.findAll();
    }
    public void removeClothes(Long id) {
        clothesRepository.deleteById(id);
    }

    public Food addFood(Food food) {
        return foodRepository.save(food);
    }
    public List<Food> allFood() {
        return foodRepository.findAll();
    }
    public void removeFood(Long id) {
        foodRepository.deleteById(id);
    }

    public HygieneProduct addHygieneProduct(HygieneProduct product) {
        return hygieneProductRepository.save(product);
    }
    public List<HygieneProduct> allHygieneProducts() {
        return hygieneProductRepository.findAll();
    }
    public void removeHygieneProduct(Long id) {
        hygieneProductRepository.deleteById(id);
    }

    public Money addMoneyDonation(Money money) {
        return moneyRepository.save(money);
    }
    public List<Money> allMoneyDonations() {
        return moneyRepository.findAll();
    }
    public void removeMoneyDonation(Long id) {
        moneyRepository.deleteById(id);
    }

    public Toy addToy(Toy toy) {
        return toyRepository.save(toy);
    }
    public List<Toy> allToys() {
        return toyRepository.findAll();
    }
    public void removeToy(Long id) {
        toyRepository.deleteById(id);
    }

}
