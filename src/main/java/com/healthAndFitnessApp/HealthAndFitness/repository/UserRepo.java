package com.healthAndFitnessApp.HealthAndFitness.repository;

import com.healthAndFitnessApp.HealthAndFitness.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> getUserById(Long id);
}
