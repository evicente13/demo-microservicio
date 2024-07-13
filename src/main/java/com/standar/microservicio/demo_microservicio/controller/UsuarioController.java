package com.standar.microservicio.demo_microservicio.controller;

import com.standar.microservicio.demo_microservicio.dto.UsuarioDTO;
import com.standar.microservicio.demo_microservicio.entity.Usuario;
import com.standar.microservicio.demo_microservicio.implemetacion.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl userService;

    @PostMapping("/create")
    public ResponseEntity<UsuarioDTO> createUser(@RequestBody UsuarioDTO usuario) {

        UsuarioDTO userCreate =  userService.createUser(usuario);
        return new ResponseEntity<>(userCreate, HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<UsuarioDTO>> getAllUsers() {
          List<UsuarioDTO> listUser = userService.getAllUser();
          return new ResponseEntity<>(listUser, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<UsuarioDTO> getUser(@PathVariable("id") Integer id) {
        UsuarioDTO userById = userService.getUserById(id);
        return new ResponseEntity<UsuarioDTO>(userById, HttpStatus.OK);
    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/update/{id}")
    public ResponseEntity<UsuarioDTO> updateUser(@PathVariable("id") Integer id, @RequestBody UsuarioDTO usuario) {
       UsuarioDTO updateUser =  userService.updateUser(usuario, id);
       return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

}
