package br.com.labs.schoolapi.repository;

import br.com.labs.schoolapi.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment,Long> {
}
