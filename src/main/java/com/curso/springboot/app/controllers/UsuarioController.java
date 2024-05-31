package com.curso.springboot.app.controllers;

import com.curso.springboot.app.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Deiby");
        usuario.setApellido("Arroyave");
        usuario.setEmail("deibhyarroyave@gmail.com");
        usuario.setTelefono("3011580102");

        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuario() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Deiby");
        usuario.setApellido("Arroyave");
        usuario.setEmail("deibhyarroyave@gmail.com");
        usuario.setTelefono("3011580102");

        Usuario usuario2 = new Usuario();
        usuario2.setId(12L);
        usuario2.setNombre("Gínes");
        usuario2.setApellido("Miñano");
        usuario2.setEmail("qwertyui@gmail.com");
        usuario2.setTelefono("1234567");

        Usuario usuario3 = new Usuario();
        usuario3.setId(123L);
        usuario3.setNombre("Nacho");
        usuario3.setApellido("Argentino");
        usuario3.setEmail("deiboiuykfgmail.com");
        usuario3.setTelefono("312344502");

        Usuario usuario4 = new Usuario();
        usuario4.setId(1234L);
        usuario4.setNombre("Mike");
        usuario4.setApellido("Shinobi");
        usuario4.setEmail("dei@il.com");
        usuario4.setTelefono("300000002");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        return usuarios;
    }

    @RequestMapping(value = "usuario123")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Deiby");
        usuario.setApellido("Arroyave");
        usuario.setEmail("deibhyarroyave@gmail.com");
        usuario.setTelefono("3011580102");

        return usuario;
    }

    @RequestMapping(value = "usuario2345")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Deiby");
        usuario.setApellido("Arroyave");
        usuario.setEmail("deibhyarroyave@gmail.com");
        usuario.setTelefono("3011580102");

        return usuario;
    }

    @RequestMapping(value = "usuario12345/{id}")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Deiby");
        usuario.setApellido("Arroyave");
        usuario.setEmail("deibhyarroyave@gmail.com");
        usuario.setTelefono("3011580102");

        return usuario;
    }
}