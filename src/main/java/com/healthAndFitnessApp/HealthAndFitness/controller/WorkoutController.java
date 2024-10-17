package com.healthAndFitnessApp.HealthAndFitness.controller;

import com.healthAndFitnessApp.HealthAndFitness.model.Workout;
import com.healthAndFitnessApp.HealthAndFitness.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {
    @Autowired
    private WorkoutService workoutService;

    @PostMapping
    public ResponseEntity<Workout> logWorkout(@RequestBody Workout workout) {
        return ResponseEntity.ok(workoutService.logWorkout(workout));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Workout>> getUserWorkouts(@PathVariable Long userId) {
        return ResponseEntity.ok(workoutService.getWorkoutsByUserId(userId));
    }
}

// This response of getting data
//[
//        {
//        "id": 1,
//        "name": "Morning Run",
//        "duration": 30,
//        "caloriesBurned": 300,
//        "user": {
//        "id": 1,
//        "name": "John Doe",
//        "email": "johndoe@example.com",
//        "password": null,
//        "weight": 70.5,
//        "height": 1.75
//        }
//        }
//        ]