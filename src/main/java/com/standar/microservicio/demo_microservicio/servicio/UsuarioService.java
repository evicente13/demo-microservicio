package com.standar.microservicio.demo_microservicio.servicio;

import com.standar.microservicio.demo_microservicio.dto.UsuarioDTO;
import com.standar.microservicio.demo_microservicio.entity.Usuario;

import java.time.LocalDateTime;
import java.util.List;

public interface UsuarioService {

    public UsuarioDTO createUser(UsuarioDTO usuario);
    public UsuarioDTO updateUser(UsuarioDTO usuario, Integer id);
    public void deleteUser(Integer id);
    public List<UsuarioDTO> getAllUser();
    public UsuarioDTO getUserById(Integer id);

}
