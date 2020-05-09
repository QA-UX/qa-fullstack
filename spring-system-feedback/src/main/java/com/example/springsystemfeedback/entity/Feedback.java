package com.example.springsystemfeedback.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFeedback;

    @Column
    private Date dataFeedback;

    @Column(name = "feedaback")
    private String feedback;

    @Column
    private Boolean publico;

    //colocar os demais atributos e getters and setters

}
