package br.com.labs.schoolapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Enrollment {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Grade grade;

    @ManyToOne
    private ClassSchool classSchool;

    @ManyToOne
    private Student student;

    @ManyToOne
    private School school;

    private String year;

    public Enrollment() {
        super();
    }

    public Enrollment(Grade grade, Student student, School school, ClassSchool classSchool) {
        this.grade = grade;
        this.student = student;
        this.school = school;
        this.classSchool = classSchool;
    }
}
