
package com.proyecto.tareas.repository;

import com.proyecto.tareas.model.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITareasRepository extends JpaRepository<Tareas,Long> {
    
}
