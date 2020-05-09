package com.example.springsystemfeedback.controller;

import com.example.springsystemfeedback.entity.Administrador;
import com.example.springsystemfeedback.entity.Colaborador;
import com.example.springsystemfeedback.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ColaboradorResource {

    @Autowired
    private ColaboradorRepository colaboradorRepository;

    @RequestMapping(value = "/colaboradores", method = RequestMethod.GET)
    public List<Colaborador> findAllColaboradores(){
        return colaboradorRepository.findAll();
    }

    @RequestMapping(value = "/colaboradorees", method = RequestMethod.POST)
    public Colaborador cadastrarColaborador(@Valid @RequestBody Colaborador colaborador){
        return colaboradorRepository.save(colaborador);
    }

    //terminar o restante dos métodos necessários para o projeto
}
