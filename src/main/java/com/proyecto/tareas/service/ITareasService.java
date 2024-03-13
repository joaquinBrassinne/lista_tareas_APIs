
package com.proyecto.tareas.service;

import com.proyecto.tareas.model.Tareas;
import java.util.List;


public interface ITareasService {
    public List<Tareas> getTareas();
    public void crearTarea(Tareas tarea);
    public Tareas getOneTarea(Long id_tarea);
    public void editTareas(Tareas tarea); 
    public void deleteTarea(Long id_tarea);
}
