package com.healthAndFitnessApp.HealthAndFitness.service;

import com.healthAndFitnessApp.HealthAndFitness.model.Meal;
import com.healthAndFitnessApp.HealthAndFitness.repository.MealRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    @Autowired
    private MealRepo mealRepository;

    public Meal logMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    public List<Meal> getMealsByUserId(Long userId) {
        return mealRepository.findByUserId(userId);
    }
}
