package com.standar.microservicio.demo_microservicio.mapper;

import com.standar.microservicio.demo_microservicio.dto.UsuarioDTO;
import com.standar.microservicio.demo_microservicio.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUsuarioMapper {
    AutoUsuarioMapper MAPPER = Mappers.getMapper(AutoUsuarioMapper.class);

    @Mapping(source = "idUser", target = "id")
    @Mapping(source = "nameUser", target = "nombre")
    @Mapping(source = "emailUser", target = "correo")
    @Mapping(source = "userNameUser", target = "username")
    @Mapping(source = "passwordUser", target = "contrasena")
    @Mapping(source = "statusUser", target = "estado")
    @Mapping(source = "createUser", target = "registro")
    Usuario mapToUsuario(UsuarioDTO usuarioDTO);

    @Mapping(source = "id", target = "idUser")
    @Mapping(source = "nombre", target = "nameUser")
    @Mapping(source = "correo", target = "emailUser")
    @Mapping(source = "username", target = "userNameUser")
    @Mapping(source = "contrasena", target = "passwordUser")
    @Mapping(source = "estado", target = "statusUser")
    @Mapping(source = "registro", target = "createUser")
    UsuarioDTO mapToUsuarioDTO(Usuario usuario);

}
