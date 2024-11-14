package br.com.labs.schoolapi.dto;

public class CreateEnrollmentDTO {

    private Long studentId;

    private Long schoolId;

    private Long classSchoolId;

    private Long gradeId;

    public Long getStudentId() {
        return studentId;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public Long getClassSchoolId() {
        return classSchoolId;
    }

    public Long getGradeId() {
        return gradeId;
    }
}
