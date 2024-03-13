package com.proyecto.tareas.service;


import com.proyecto.tareas.model.Usuario;
import com.proyecto.tareas.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    IUsuarioRepository usuRepo;

    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> listaUsuario = usuRepo.findAll();
        return listaUsuario;
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        usuRepo.save(usuario);
    }

    @Override
    public Usuario getOneUsuario(Long id_usuario) {
        return usuRepo.findById(id_usuario).orElse(null);

    }

    @Override
    public void editUsuario(Usuario usuario) {
        this.crearUsuario(usuario);

    }

    @Override
    public void deleteUsuario(Long id_usuario) {
        usuRepo.deleteById(id_usuario);
    }

    
    
    
    

}
