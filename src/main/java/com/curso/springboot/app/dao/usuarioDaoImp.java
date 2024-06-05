package com.curso.springboot.app.dao;

import com.curso.springboot.app.models.Usuario;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
//@Transactional
public class usuarioDaoImp implements usuarioDao {
    @Override
    public List<Usuario> getUsuario() {
        return List.of();
    }
}
