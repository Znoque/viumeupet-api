/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.znoque.viumeupet.repositories;

import com.znoque.viumeupet.entidade.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Enoque
 */
public interface PetRepository extends JpaRepository<Pet, Long>{
}
