
package com.proyecto.tareas.controller;


import com.proyecto.tareas.model.Usuario;
import com.proyecto.tareas.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    IUsuarioService usuService;
    
    @GetMapping("/usuarios/traer")
    public List<Usuario> getUsuarios(){
        return usuService.getUsuario();
    }
    
   
    
    @GetMapping("/usuarios/traer/{id_usuario}")
    public Usuario findUsuario(@PathVariable Long id_usuario){
        return usuService.getOneUsuario(id_usuario);
    }
    
    
    @PostMapping("/usuarios/crear")
    public String saveUsuario(@RequestBody Usuario usuario){
        usuService.crearUsuario(usuario);
        return "Usuario creado correctamente"; 
    }
    
    @PutMapping("/usuarios/editar")
    public String editUsuario(@RequestBody Usuario usuario){
        usuService.editUsuario(usuario);
        
        return "Usuario editado correctamente";
    }
    @DeleteMapping("/usuarios/eliminar/{id_usuario}")
    public String deleteUsuario(@PathVariable Long id_usuario){
        
        usuService.deleteUsuario(id_usuario);
        return "Usuario eliminado correctamente";
    }
    
}
