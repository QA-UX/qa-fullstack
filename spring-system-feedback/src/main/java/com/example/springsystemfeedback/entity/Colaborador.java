package com.example.springsystemfeedback.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nomeusuario")
    private String nomeUsuario;

    @Column(name="nomecompleto")
    private String nomeCompleto;

    @Column(name = "datanascimento")
    private Date dataNascimento;

    @OneToMany
    @JoinColumn(name = "idFeedback")
    private List<Feedback> feedbackList;

    //terminar o restante dos atributos do colaborador
    // criar os getters and setters
}
