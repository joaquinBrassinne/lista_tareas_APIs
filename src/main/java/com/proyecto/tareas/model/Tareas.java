package com.proyecto.tareas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Tareas {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id_tarea;
    private String nombre;
    private String descripcion;
    private LocalDate fecha_creacion;
    private LocalDate fecha_vencimiento;
    private String estado;
    

    public Tareas() {
    }

    public Tareas(Long id_tarea, String nombre, String descripcion, LocalDate fecha_creacion, LocalDate fecha_vencimiento, String estado) {
        this.id_tarea = id_tarea;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.estado = estado;
    }

    

    
    

}
