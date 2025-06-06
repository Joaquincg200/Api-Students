package com.joaquin.student.service;

import com.joaquin.student.dto.CreateStudentRequest;
import com.joaquin.student.dto.StudentDTO;
import com.joaquin.student.entity.Student;
import com.joaquin.student.exceptions.StudentNotFoundException;
import com.joaquin.student.mappers.StudentMapper;
import com.joaquin.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpls implements  IService{

    private StudentRepository studentRepository;
    private StudentMapper studentMapper;

    public ServiceImpls(StudentMapper studentMapper, StudentRepository studentRepository) {
        this.studentMapper = studentMapper;
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students= this.studentRepository.findAll();
        return this.studentMapper.studentToStudentDTO(students);
    }

    @Override
    public StudentDTO createStudent(CreateStudentRequest createStudentRequest) {
        Student student = new Student(
                createStudentRequest.getName(),
                createStudentRequest.getMail(),
                createStudentRequest.getDate_born(),
                createStudentRequest.getFinished());

        Student students1 = this.studentRepository.save(student);
        return this.studentMapper.studentToStudentDTO(student);
    }

    @Override
    public StudentDTO updateStudent(CreateStudentRequest createStudentRequest, int id) {
        Optional<Student> studentOpcional = this.studentRepository.findById(id);
        if(studentOpcional.isPresent()){
            Student student = studentOpcional.get();
            student.setName(createStudentRequest.getName());
            student.setMail(createStudentRequest.getMail());
            student.setDate_born(createStudentRequest.getDate_born());
            Student student1 = this.studentRepository.save(student);

            return this.studentMapper.studentToStudentDTO(student1);
        }else{
            throw new StudentNotFoundException("No se ha encontrado ningun estudiante con esa id");
        }

    }

    @Override
    public StudentDTO deleteStudent(int id) {
        Optional<Student> studentOptional = this.studentRepository.findById(id);
        if(studentOptional.isPresent()){
            Student student = studentOptional.get();
            this.studentRepository.deleteById(id);

            return this.studentMapper.studentToStudentDTO(student);
        }else{
            throw new StudentNotFoundException("No se ha encontrado ningun estudiante con esa id");
        }

    }

    @Override
    public List<StudentDTO> getAllFinished(boolean finished) {
        return this.studentMapper.studentToStudentDTO(this.studentRepository.findByFinished(finished));
    }


}
