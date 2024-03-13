package com.proyecto.tareas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id_usuario;
    private String nombre;
    private String apellido;
    private String dni;
    @OneToMany
    private List<Tareas> ListaTarea;

    public Usuario() {
    }

    public Usuario(Long id_usuario, String nombre, String apellido, String dni, List<Tareas> ListaTarea) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.ListaTarea = ListaTarea;
    }

}
