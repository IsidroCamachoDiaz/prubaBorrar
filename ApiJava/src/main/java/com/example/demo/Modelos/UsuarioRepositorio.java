package com.example.demo.Modelos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Implementacion de la Interface Usuario que extiende Jpa 
 * @author ASMP-16/11/23
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
