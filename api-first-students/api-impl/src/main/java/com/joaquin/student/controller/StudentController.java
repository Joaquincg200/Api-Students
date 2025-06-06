package com.joaquin.student.controller;

import com.joaquin.student.dto.CreateStudentRequest;
import com.joaquin.student.dto.StudentDTO;
import com.joaquin.student.service.ServiceImpls;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private ServiceImpls serviceImpls;

    public StudentController(ServiceImpls serviceImpls) {
        this.serviceImpls = serviceImpls;
    }

    @GetMapping("/students")
    public ResponseEntity<List<StudentDTO>> getAll(){
            return ResponseEntity.ok(this.serviceImpls.getAllStudents());
    }

    @GetMapping("/students/finished/{value}")
    public ResponseEntity<List<StudentDTO>> getAllFinished(@PathVariable boolean value){
        return ResponseEntity.ok(this.serviceImpls.getAllFinished(value));
    }

    @PostMapping("/student/create")
    public  ResponseEntity<StudentDTO> createStudent(@RequestBody CreateStudentRequest createStudentRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.serviceImpls.createStudent(createStudentRequest));
    }

    @PatchMapping("/student/update/{id}")
    public ResponseEntity<StudentDTO> updateStudent(@RequestBody @Valid CreateStudentRequest createStudentRequest, @PathVariable int id){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.serviceImpls.updateStudent(createStudentRequest, id));
    }

    @DeleteMapping("/student/delete/{id}")
    public ResponseEntity<StudentDTO> deleteStudent(@RequestBody @PathVariable int id){
        return ResponseEntity.ok(this.serviceImpls.deleteStudent(id));
    }
}
