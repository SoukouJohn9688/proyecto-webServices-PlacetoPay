package com.SpringPrueba.Prueba.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
//@Data Engloba lo de los getters y setter, asi como @ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String dept;


}
