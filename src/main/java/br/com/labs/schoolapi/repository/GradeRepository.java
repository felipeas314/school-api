package br.com.labs.schoolapi.repository;

import br.com.labs.schoolapi.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade,Long> {
}
