package com.curso.springboot.app.dao;

import com.curso.springboot.app.models.Usuario;

import java.util.List;

public interface usuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(long id);
}
