package com.albuquerque.sgaapi.services;

import com.albuquerque.sgaapi.entities.Institution;
import com.albuquerque.sgaapi.entities.donation.*;
import com.albuquerque.sgaapi.repositories.DonationRepository;
import com.albuquerque.sgaapi.repositories.InstitutionRepository;
import com.albuquerque.sgaapi.repositories.donation.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonationService {

    private final DonationRepository repository;

    public List<Donation> allItems() {
        return repository.findAll();
    }

    public Donation addItem(Donation newItem) {
        return repository.save(newItem);
    }

//    private final ClothesRepository        clothesRepository;
//    private final FoodRepository           foodRepository;
//    private final HygieneProductRepository hygieneProductRepository;
//    private final MoneyRepository          moneyRepository;
//    private final ToyRepository            toyRepository;
//
//    private final InstitutionRepository institutionRepository;
//
//    public Clothes addClothes(Clothes clothes) {
//        return clothesRepository.save(clothes);
//    }
//    public List<Clothes> allClothes() {
//        return clothesRepository.findAllByForwardedTo(null);
//    }
//    public void forwardClothes(Long clothesId, Long institutionId) {
//        Clothes clothes = clothesRepository.findById(clothesId).get();
//        Institution institution = institutionRepository.findById(institutionId).get();
//        clothes.setForwardedTo(institution);
//        clothesRepository.save(clothes);
//    }
//
//    public Food addFood(Food food) {
//        return foodRepository.save(food);
//    }
//    public List<Food> allFood() {
//        return foodRepository.findAllByForwardedTo(null);
//    }
//    public void forwardFood(Long foodId, Long institutionId) {
//        Food food = foodRepository.findById(foodId).get();
//        Institution institution = institutionRepository.findById(institutionId).get();
//        food.setForwardedTo(institution);
//        foodRepository.save(food);
//    }
//
//    public HygieneProduct addHygieneProduct(HygieneProduct product) {
//        return hygieneProductRepository.save(product);
//    }
//    public List<HygieneProduct> allHygieneProducts() {
//        return hygieneProductRepository.findAllByForwardedTo(null);
//    }
//    public void forwardHygieneProduct(Long hygieneProductId, Long institutionId) {
//        HygieneProduct product = hygieneProductRepository.findById(hygieneProductId).get();
//        Institution institution = institutionRepository.findById(institutionId).get();
//        product.setForwardedTo(institution);
//        hygieneProductRepository.save(product);
//    }
//
//    public Money addMoney(Money money) {
//        return moneyRepository.save(money);
//    }
//    public List<Money> allMoney() {
//        return moneyRepository.findAllByForwardedTo(null);
//    }
//    public void forwardMoney(Long moneyId, Long institutionId) {
//        Money money = moneyRepository.findById(moneyId).get();
//        Institution institution = institutionRepository.findById(institutionId).get();
//        money.setForwardedTo(institution);
//        moneyRepository.save(money);
//    }
//
//    public Toy addToy(Toy toy) {
//        return toyRepository.save(toy);
//    }
//    public List<Toy> allToys() {
//        return toyRepository.findAllByForwardedTo(null);
//    }
//    public void forwardToy(Long toyId, Long institutionId) {
//        Toy toy = toyRepository.findById(toyId).get();
//        Institution institution = institutionRepository.findById(institutionId).get();
//        toy.setForwardedTo(institution);
//        toyRepository.save(toy);
//    }

}
