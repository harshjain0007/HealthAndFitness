package com.healthAndFitnessApp.HealthAndFitness.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Progress {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate localDate;
    private Double weight;   //Users weight on this Date
    private Double caloriesConsumed;
    private Double caloriesBurned;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private User user;

}
