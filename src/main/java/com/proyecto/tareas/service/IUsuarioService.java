
package com.proyecto.tareas.service;

import com.proyecto.tareas.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    public List<Usuario> getUsuario();
    public void crearUsuario(Usuario usuario);
    public Usuario getOneUsuario(Long id_usuario);
    public void editUsuario(Usuario usuario); 
    public void deleteUsuario(Long id_usuario);
    

}
