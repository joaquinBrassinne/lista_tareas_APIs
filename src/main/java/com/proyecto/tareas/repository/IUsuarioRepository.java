
package com.proyecto.tareas.repository;

import com.proyecto.tareas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends  JpaRepository<Usuario,Long>{
    
}
