package br.com.labs.schoolapi.repository;

import br.com.labs.schoolapi.model.ClassSchool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassSchoolRepository extends JpaRepository<ClassSchool,Long> {
}
