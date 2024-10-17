package com.healthAndFitnessApp.HealthAndFitness.service;

import com.healthAndFitnessApp.HealthAndFitness.model.User;
import com.healthAndFitnessApp.HealthAndFitness.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User update(Long id, User user) {
        User usser= userRepository.getUserById(id).get();
        if(usser != null){
            usser.setName(user.getName());
            usser.setEmail(user.getEmail());
            usser.setWeight(user.getWeight());
            usser.setHeight(user.getHeight());
            return userRepository.save(usser);
        }else {
            return userRepository.save(user);
        }
    }
}
