
package com.proyecto.tareas.controller;

import com.proyecto.tareas.model.Tareas;
import com.proyecto.tareas.service.ITareasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TareaController {
       @Autowired
    ITareasService tareaService;
    
    @GetMapping("/tareas/traer")
    public List<Tareas> getTareas(){
        return tareaService.getTareas();
    }
    
    @GetMapping("/tareas/traer/{id_tarea}")
    public Tareas findTarea(@RequestParam Long id_tarea){
        return tareaService.getOneTarea(id_tarea);
    }
    
    @PostMapping("/tareas/crear")
    public String saveTareas(@RequestBody Tareas tareas){
        tareaService.crearTarea(tareas);
        return "Tarea creada correctamente"; 
    }
    
    @PutMapping("/tareas/editar")
    public String editTarea(@RequestBody Tareas tarea){
        tareaService.editTareas(tarea);
        return "Tarea editado correctamente";
    }
    @DeleteMapping("/tareas/eliminar/{id_tareas}")
    public String deleteTareas(@RequestParam Long id_tarea){ 
        tareaService.deleteTarea(id_tarea);
        return "Tarea eliminada correctamente";
    }
}
