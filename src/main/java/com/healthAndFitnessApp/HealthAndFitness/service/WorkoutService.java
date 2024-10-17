package com.healthAndFitnessApp.HealthAndFitness.service;

import com.healthAndFitnessApp.HealthAndFitness.model.Workout;
import com.healthAndFitnessApp.HealthAndFitness.repository.WorkoutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {
    @Autowired
    private WorkoutRepo workoutRepository;

    public Workout logWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    public List<Workout> getWorkoutsByUserId(Long userId) {
        return workoutRepository.findByUserId(userId);
    }
}