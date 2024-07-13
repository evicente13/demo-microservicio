package com.standar.microservicio.demo_microservicio.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @Column(name="email")
    private String correo;
    private String username;
    @Column(name="password")
    private String contrasena;
    @Column(name="status")
    private Integer estado;
    @Column(name="fechaRegistro")
    private Date registro;
}
