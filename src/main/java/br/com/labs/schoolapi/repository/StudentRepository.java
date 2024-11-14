package br.com.labs.schoolapi.repository;

import br.com.labs.schoolapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
