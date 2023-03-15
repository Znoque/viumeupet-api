package com.znoque.viumeupet.repositories;

import com.znoque.viumeupet.entidade.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Enoque
 */
public interface PetRepository extends JpaRepository<Pet, Long>{
}
