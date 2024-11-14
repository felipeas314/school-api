package br.com.labs.schoolapi.model;

import jakarta.persistence.*;

@Entity
public class StudentContact {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String phoneNumber;

    @ManyToOne
    private Student student;
}
