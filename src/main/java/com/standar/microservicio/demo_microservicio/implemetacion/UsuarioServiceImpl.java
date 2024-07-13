package com.standar.microservicio.demo_microservicio.implemetacion;

import com.standar.microservicio.demo_microservicio.dto.UsuarioDTO;
import com.standar.microservicio.demo_microservicio.entity.Usuario;
import com.standar.microservicio.demo_microservicio.mapper.AutoUsuarioMapper;
import com.standar.microservicio.demo_microservicio.repository.UsuarioRepostory;
import com.standar.microservicio.demo_microservicio.servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepostory userRepostory;

    @Override
    public UsuarioDTO createUser(UsuarioDTO usuarioDTO) {


        Usuario usuario = AutoUsuarioMapper.MAPPER.mapToUsuario(usuarioDTO);
        Usuario userCreated = userRepostory.save(usuario);
        UsuarioDTO ususarioDTOCreated = AutoUsuarioMapper.MAPPER.mapToUsuarioDTO(userCreated);
        return ususarioDTOCreated;

    }

    @Override
    public UsuarioDTO updateUser(UsuarioDTO usuarioDTO, Integer id) {
       Optional<Usuario> result= userRepostory.findById(id);
        if (result.isPresent()) {
                Usuario usuario  = AutoUsuarioMapper.MAPPER.mapToUsuario(usuarioDTO);
                Usuario userUpdated= userRepostory.save(usuario);
                UsuarioDTO usuarioDTO1 = AutoUsuarioMapper.MAPPER.mapToUsuarioDTO(userUpdated);
                return usuarioDTO1;
        }
        else
            return null;
    }

    @Override
    public void deleteUser(Integer id) {
        userRepostory.deleteById(id);
    }

    @Override
    public List<UsuarioDTO> getAllUser() {
        List<UsuarioDTO> listUsuarioDTO = new ArrayList<>();
        List<Usuario> listUsers = userRepostory.findAll();

        System.out.println(listUsers.size());

        for (Usuario usuario : listUsers) {
            System.out.println(usuario.toString());
            UsuarioDTO usuarioDTO = AutoUsuarioMapper.MAPPER.mapToUsuarioDTO(usuario);
            listUsuarioDTO.add(usuarioDTO);
        }

        return listUsuarioDTO;
    }

    @Override
    public UsuarioDTO getUserById(Integer id) {
        System.out.println("ID--->"+id);
        Usuario usuario = userRepostory.findById(id).orElse(null);
        System.out.println(usuario.toString());
        UsuarioDTO usuarioDTO = AutoUsuarioMapper.MAPPER.mapToUsuarioDTO(usuario);
        return  usuarioDTO;
    }
}
