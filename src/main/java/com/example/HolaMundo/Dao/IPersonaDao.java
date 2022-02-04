package com.example.HolaMundo.Dao;


import com.example.HolaMundo.Logica.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona, Integer> {

}
