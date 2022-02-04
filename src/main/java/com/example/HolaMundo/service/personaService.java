package com.example.HolaMundo.service;

import com.example.HolaMundo.Logica.Persona;

import java.util.List;

public interface personaService {
    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);

}
