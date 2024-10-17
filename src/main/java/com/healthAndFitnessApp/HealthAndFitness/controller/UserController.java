package com.healthAndFitnessApp.HealthAndFitness.controller;

import com.healthAndFitnessApp.HealthAndFitness.model.User;
import com.healthAndFitnessApp.HealthAndFitness.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return ResponseEntity.of(userService.findById(id));
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User user){
        return  ResponseEntity.ok( userService.update(id, user));

    }


}
