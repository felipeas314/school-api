package br.com.labs.schoolapi.controller;

import br.com.labs.schoolapi.dto.CreateEnrollmentDTO;
import br.com.labs.schoolapi.model.Enrollment;
import br.com.labs.schoolapi.service.CreateEnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollmentController {

    @Autowired
    private CreateEnrollmentService createEnrollmentUseCase;

    @PostMapping
    public ResponseEntity<Enrollment> create(@RequestBody CreateEnrollmentDTO createEnrollmentDTO) {
        Enrollment enrollment = createEnrollmentUseCase.execute(createEnrollmentDTO);
        return ResponseEntity.ok(enrollment);
    }
}
