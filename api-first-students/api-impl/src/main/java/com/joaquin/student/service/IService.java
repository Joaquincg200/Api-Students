package com.joaquin.student.service;


import com.joaquin.student.dto.CreateStudentRequest;
import com.joaquin.student.dto.StudentDTO;

import java.util.List;

public interface IService {
    List<StudentDTO> getAllStudents();
    StudentDTO createStudent(CreateStudentRequest createStudentRequest);
    StudentDTO updateStudent(CreateStudentRequest createStudentRequest, int id);
    StudentDTO deleteStudent(int id);
    List<StudentDTO> getAllFinished(boolean finished);

}
