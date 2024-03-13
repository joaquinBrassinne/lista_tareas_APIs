package com.proyecto.tareas.service;

import com.proyecto.tareas.model.Tareas;
import com.proyecto.tareas.repository.ITareasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaService implements ITareasService {

    @Autowired
    ITareasRepository tareaRepo;

    @Override
    public List<Tareas> getTareas() {
        List<Tareas> listaTareas = tareaRepo.findAll();
        return listaTareas;
    }

    @Override
    public void crearTarea(Tareas tarea) {
        tareaRepo.save(tarea);
    }

    @Override
    public Tareas getOneTarea(Long id_tarea) {
        return tareaRepo.findById(id_tarea).orElse(null);
    }

    @Override
    public void editTareas(Tareas tarea) {
        this.crearTarea(tarea);
    }

    @Override
    public void deleteTarea(Long id_tarea) {
        tareaRepo.deleteById(id_tarea);
    }
    

}
