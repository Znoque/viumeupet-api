package com.znoque.viumeupet.controllers;

import com.znoque.viumeupet.entidade.Login;
import com.znoque.viumeupet.repositories.LoginRepository;
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
@RequestMapping("/login")
public class LoginRest {
    
    @Autowired
    private LoginRepository loginRepositorio;

    @GetMapping
    public List< Login> listar(){
        return loginRepositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody  Login  login){
        loginRepositorio.save( login);
    }

    @PutMapping
    public void alterar(@RequestBody  Login  login){
        if((login != null) && (login.getId() > 0)){
            loginRepositorio.save( login);
        }
    }

    @DeleteMapping
    public void excluir(@RequestBody  Login  login){
        loginRepositorio.delete( login);
    }
}
