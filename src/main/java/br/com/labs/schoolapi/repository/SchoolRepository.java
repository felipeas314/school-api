package br.com.labs.schoolapi.repository;

import br.com.labs.schoolapi.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Long> {
}
