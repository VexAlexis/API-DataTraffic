package com.api.crud.rest.repository;

import com.api.crud.rest.model.Personajes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MainRepository extends JpaRepository <Personajes, Long>{
    

}

