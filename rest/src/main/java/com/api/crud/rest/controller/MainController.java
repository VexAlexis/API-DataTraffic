package com.api.crud.rest.controller;

import java.util.List;
import java.util.Optional;

import com.api.crud.rest.model.Personajes;
import com.api.crud.rest.repository.MainRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private MainRepository mainRepository;

    @GetMapping(value = "/")
    public String holaMundo(){
        return "Hola Mundo";
    }

    @GetMapping(value = "/characters")
    public List <Personajes> getPersonajes(){
        return mainRepository.findAll();
    }

    @GetMapping(value = "/characters/{id}")
    public Optional<Personajes> getPersonajesPorId(@PathVariable(name = "id") int id){
        return mainRepository.findById((long) id);
    }

    @PostMapping(value = "/saveCharacter")
    public String saveCharacter(@RequestBody Personajes personaje){
        mainRepository.save(personaje);
        return "Saved character";
    }

}
