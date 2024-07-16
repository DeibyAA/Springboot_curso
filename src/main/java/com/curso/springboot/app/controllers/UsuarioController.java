package com.curso.springboot.app.controllers;

import com.curso.springboot.app.dao.usuarioDao;
import com.curso.springboot.app.models.Usuario;
import com.curso.springboot.app.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class UsuarioController {

    @Autowired
    private usuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Deiby");
        usuario.setApellido("Arroyave");
        usuario.setEmail("deibhyarroyave@gmail.com");
        usuario.setTelefono("3011580102");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "api/usuario123")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Deiby");
        usuario.setApellido("Arroyave");
        usuario.setEmail("deibhyarroyave@gmail.com");
        usuario.setTelefono("3011580102");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable long id) {
        usuarioDao.eliminar(id);
    }
    
    @RequestMapping(value = "api/usuario12345/{id}")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Deiby");
        usuario.setApellido("Arroyave");
        usuario.setEmail("deibhyarroyave@gmail.com");
        usuario.setTelefono("3011580102");
        return usuario;
    }

}