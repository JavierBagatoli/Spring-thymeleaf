package com.example.HolaMundo.Dao;

import com.example.HolaMundo.Logica.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
