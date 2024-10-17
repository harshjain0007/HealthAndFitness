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
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mealType;//Lunch , Dinner ,Breakfast
    private Integer calories;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private User user;

}
