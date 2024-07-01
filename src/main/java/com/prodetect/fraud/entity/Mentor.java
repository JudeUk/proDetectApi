package com.prodetect.fraud.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Mentor {

    // Mentor.java

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
        private String techStack;
        private String typeOfMentor;
        private String email;
        private String topics;
        private String country;
        private String about;
        private int rates;
    }

