package com.univer.service_students.model.entity;
import jakarta.persistence.*;

import javax.naming.Name;

@Entity
@Table (name= "CURSO")
public class cursos{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "Id_class")

    private int id;
    @Column(name = "NOMBRE")
    private String name;
}
