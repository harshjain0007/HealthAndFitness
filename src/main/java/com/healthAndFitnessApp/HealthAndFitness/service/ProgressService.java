package com.healthAndFitnessApp.HealthAndFitness.service;

import com.healthAndFitnessApp.HealthAndFitness.model.Progress;
import com.healthAndFitnessApp.HealthAndFitness.repository.ProgressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressService {
    @Autowired
    private ProgressRepo progressRepository;

    public Progress logProgress(Progress progress) {
        return progressRepository.save(progress);
    }

    public List<Progress> getProgressByUserId(Long userId) {
        return progressRepository.findByUserId(userId);
    }
}
