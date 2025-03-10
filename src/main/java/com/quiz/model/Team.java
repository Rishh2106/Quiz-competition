package com.quiz.model;

import javax.persistence.*;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String uniqueId;
    private String password;
    private int score;

    // Getters and setters
}
