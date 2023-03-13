/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.znoque.viumeupet.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 *
 * @author Enoque
 */
@Entity
@Table
public class Pet {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(length = 40, nullable = false)
    private String nome;

    @Column(length = 40, nullable = false)
    private String raca;

    @Column(nullable = false)
    private String caracteristicas;

    @Column(nullable = false)
    private String ultimaVezVisto;
    
    public Pet() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getUltimaVezVisto() {
        return ultimaVezVisto;
    }

    public void setUltimaVezVisto(String ultimaVezVisto) {
        this.ultimaVezVisto = ultimaVezVisto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.Id);
        hash = 13 * hash + Objects.hashCode(this.nome);
        hash = 13 * hash + Objects.hashCode(this.raca);
        hash = 13 * hash + Objects.hashCode(this.caracteristicas);
        hash = 13 * hash + Objects.hashCode(this.ultimaVezVisto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pet other = (Pet) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.raca, other.raca)) {
            return false;
        }
        if (!Objects.equals(this.caracteristicas, other.caracteristicas)) {
            return false;
        }
        if (!Objects.equals(this.ultimaVezVisto, other.ultimaVezVisto)) {
            return false;
        }
        return Objects.equals(this.Id, other.Id);
    }
}
