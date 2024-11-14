package br.com.labs.schoolapi.repository;

import br.com.labs.schoolapi.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
