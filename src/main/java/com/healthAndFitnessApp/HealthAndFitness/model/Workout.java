package com.healthAndFitnessApp.HealthAndFitness.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer duration;//in Minutes
    private Integer caloriesBurned;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
