package br.com.labs.schoolapi.service;

import br.com.labs.schoolapi.dto.CreateEnrollmentDTO;
import br.com.labs.schoolapi.model.*;
import br.com.labs.schoolapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateEnrollmentService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ClassSchoolRepository classSchoolRepository;

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Autowired
    private GradeRepository gradeRepository;

    public Enrollment execute(CreateEnrollmentDTO createEnrollmentDTO) {

        School school = schoolRepository.findById(createEnrollmentDTO.getSchoolId()).orElseThrow();
        Student student = studentRepository.findById(createEnrollmentDTO.getStudentId()).orElseThrow();
        Grade grade = gradeRepository.findById(createEnrollmentDTO.getGradeId()).orElseThrow();
        ClassSchool classSchool = classSchoolRepository.findById(createEnrollmentDTO.getClassSchoolId()).orElseThrow();

        Enrollment enrollment = new Enrollment(grade,student,school,classSchool);

        enrollment = enrollmentRepository.save(enrollment);
        return enrollment;
    }

}
