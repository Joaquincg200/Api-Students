package com.joaquin.student.mappers;

import com.joaquin.student.dto.StudentDTO;
import com.joaquin.student.entity.Student;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentDTO studentToStudentDTO(Student student);
    List<StudentDTO> studentToStudentDTO(List<Student> students);
}
