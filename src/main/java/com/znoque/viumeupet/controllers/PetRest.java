package com.znoque.viumeupet.controllers;

import com.znoque.viumeupet.entidade. Pet;
import com.znoque.viumeupet.repositories.PetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Enoque
 */
@RestController
@RequestMapping("/pet")
public class PetRest {
    
    @Autowired
    private PetRepository petRepositorio;

    @GetMapping
    public List< Pet> listar(){
        return petRepositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody  Pet  pet){
        petRepositorio.save( pet);
    }

    @PutMapping
    public void alterar(@RequestBody  Pet  pet){
        if((pet != null) && (pet.getId() > 0)){
            petRepositorio.save( pet);
        }
    }

    @DeleteMapping
    public void excluir(@RequestBody  Pet  pet){
        petRepositorio.delete( pet);
    }
    
}
