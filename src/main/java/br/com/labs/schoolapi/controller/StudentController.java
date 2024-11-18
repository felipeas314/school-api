package br.com.labs.schoolapi.controller;

import br.com.labs.schoolapi.dto.CreateStudentDTO;
import br.com.labs.schoolapi.service.student.CreateStudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
public class StudentController {

    private CreateStudentService studentService;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody CreateStudentDTO createStudentDTO) {
        this.studentService.create(createStudentDTO);
        return ResponseEntity.ok("OK");
    }

    @GetMapping("list-student-by-school")
    public ResponseEntity<String> listStudentBySchool() {
        return ResponseEntity.ok("ok");
    }
}
