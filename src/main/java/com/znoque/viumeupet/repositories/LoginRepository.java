/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.znoque.viumeupet.repositories;

import com.znoque.viumeupet.entidade.Login;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Enoque
 */
public interface LoginRepository extends JpaRepository<Login, Long>{
}
