package com.healthAndFitnessApp.HealthAndFitness.controller;

import com.healthAndFitnessApp.HealthAndFitness.model.Meal;
import com.healthAndFitnessApp.HealthAndFitness.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meals")
public class MealController {
    @Autowired
    private MealService mealService;

    @PostMapping
    public ResponseEntity<Meal> logMeal(@RequestBody Meal meal) {
        return ResponseEntity.ok(mealService.logMeal(meal));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Meal>> getUserMeals(@PathVariable Long userId) {
        return ResponseEntity.ok(mealService.getMealsByUserId(userId));
    }
}
