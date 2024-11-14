package br.com.labs.schoolapi.service;

import br.com.labs.schoolapi.dto.CreateStudentDTO;
import br.com.labs.schoolapi.model.Student;
import br.com.labs.schoolapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateStudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student create(CreateStudentDTO createStudentDTO) {
        return this.studentRepository.save(Student.createStudentFromDTO(createStudentDTO));
    }
}
