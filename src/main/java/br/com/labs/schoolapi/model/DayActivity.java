package br.com.labs.schoolapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class DayActivity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private ClassSchool classSchool;

    @ManyToOne
    private School school;

    @ManyToOne
    private Diary diary;
}
