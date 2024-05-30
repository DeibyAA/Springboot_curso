package com.curso.springboot.app.controllers;

import com.curso.springboot.app.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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