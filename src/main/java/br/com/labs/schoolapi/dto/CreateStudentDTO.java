package br.com.labs.schoolapi.dto;

import br.com.labs.schoolapi.model.Student;

public record CreateStudentDTO(String name, String nickName, String email) {

}
