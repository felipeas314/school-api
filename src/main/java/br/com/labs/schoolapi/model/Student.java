package br.com.labs.schoolapi.model;

import br.com.labs.schoolapi.dto.CreateStudentDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String email;

    private String name;

    @ManyToOne
    private School school;

    public static Student createStudentFromDTO(CreateStudentDTO createStudentDTO) {
        return new Student();
    }
}
