package com.standar.microservicio.demo_microservicio.dto;

import jakarta.persistence.Column;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsuarioDTO {
    private Integer idUser;
    private String nameUser;
    private String emailUser;
    private String userNameUser;
    private String passwordUser;
    private Integer statusUser;
    private Date createUser;
}
