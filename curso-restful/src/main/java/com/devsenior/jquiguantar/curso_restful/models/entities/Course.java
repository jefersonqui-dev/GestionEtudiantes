package com.devsenior.jquiguantar.curso_restful.models.entities;

import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;
import jakarta.persistence.Column;

@Data
@Entity
@Table(name = "courses")
public class Course {
    //Un identificador id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;

    //Un nombre
    @Column(name = "name", nullable = false)
    private String name;

    //codigo del curso que idealmente es unico
    @Column(name = "code", nullable = false, unique = true)
    private String code;
    //descripcion del curso
    @Column(name = "description")
    private String description;

    //fecha de inicio
    @Column(name = "initial_date", nullable = false)
    private LocalDate initialDate;

    //Fecha DE fIN
    @Column(name = "final_date")
    private LocalDate finalDate;

    //NUMERO DE CREDITOS
    @Column(name = "credits", nullable = false)
    private Integer credits;
    
}
