package com.healthAndFitnessApp.HealthAndFitness.repository;

import com.healthAndFitnessApp.HealthAndFitness.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealRepo extends JpaRepository<Meal,Long> {

List<Meal> findByUserId(Long userId);
}
