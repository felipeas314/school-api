package br.com.labs.schoolapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Teacher {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;

}
