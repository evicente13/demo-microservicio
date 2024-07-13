package com.standar.microservicio.demo_microservicio.repository;

import com.standar.microservicio.demo_microservicio.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepostory extends JpaRepository<Usuario,Integer> {
}
