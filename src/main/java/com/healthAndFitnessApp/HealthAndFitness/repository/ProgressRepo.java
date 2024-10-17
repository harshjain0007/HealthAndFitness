package com.healthAndFitnessApp.HealthAndFitness.repository;

import com.healthAndFitnessApp.HealthAndFitness.model.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgressRepo extends JpaRepository<Progress,Long> {

    List<Progress> findByUserId(Long userId);
}
