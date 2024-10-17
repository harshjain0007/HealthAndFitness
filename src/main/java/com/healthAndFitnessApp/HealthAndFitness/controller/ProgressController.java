package com.healthAndFitnessApp.HealthAndFitness.controller;

import com.healthAndFitnessApp.HealthAndFitness.model.Progress;
import com.healthAndFitnessApp.HealthAndFitness.service.ProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/progress")
public class ProgressController {
    @Autowired
    private ProgressService progressService;

    @PostMapping
    public ResponseEntity<Progress> logProgress(@RequestBody Progress progress) {
        return ResponseEntity.ok(progressService.logProgress(progress));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Progress>> getUserProgress(@PathVariable Long userId) {
        return ResponseEntity.ok(progressService.getProgressByUserId(userId));
    }
}
//{    this is a response
 //        "id": 1,
//        "localDate": "2024-10-15",
//        "weight": 70.0,
//        "caloriesConsumed": 2000.0,
//        "caloriesBurned": 500.0,
//        "user": {
//        "id": 1,
//        "name": "John Doe",
//        "email": "johndoe@example.com",
//        "password": null,
//        "weight": 70.5,
//        "height": 1.75
//        }
//        }