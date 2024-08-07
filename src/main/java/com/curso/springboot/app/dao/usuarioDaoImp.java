package com.curso.springboot.app.dao;

import com.curso.springboot.app.models.Usuario;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class usuarioDaoImp implements usuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminar(long id) {
        Usuario usuario = entityManager.find(Usuario.class, id);
        entityManager.remove(usuario);
    }

    @Override
    public void registrar(Usuario usuario) {
        entityManager.merge(usuario);
    }
}
