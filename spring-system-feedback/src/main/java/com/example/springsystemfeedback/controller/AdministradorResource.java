package com.example.springsystemfeedback.controller;

import com.example.springsystemfeedback.entity.Administrador;
import com.example.springsystemfeedback.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class AdministradorResource {

    @Autowired
    private AdministradorRepository administradorRepository;

    @RequestMapping(value = "/administradores", method = RequestMethod.GET)
    public List<Administrador> findAllAdministradores(){
        return administradorRepository.findAll();
    }

    @RequestMapping(value = "/administradores/{id}", method = RequestMethod.GET)
    public ResponseEntity<Administrador> findById(@PathVariable(value = "id") long id){
        Optional<Administrador> administrador = administradorRepository.findById(id);
        if(administrador.isPresent()){
            return new ResponseEntity<Administrador>(administrador.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/administradores", method = RequestMethod.POST)
    public Administrador cadastrarAdministrador(@Valid @RequestBody Administrador administrador){
        return administradorRepository.save(administrador);
    }

    //terminar os métodos que são necessários para o projeto


}
