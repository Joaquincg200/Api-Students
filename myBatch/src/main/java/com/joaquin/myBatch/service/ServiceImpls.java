package com.joaquin.myBatch.service;

import com.joaquin.myBatch.entity.StudentsFinished;
import com.joaquin.myBatch.mapper.MapperStudentFinished;
import com.joaquin.myBatch.repository.StudentsFinishedRepository;
import com.joaquin.myBatch.service.IService;
import org.generator.model.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpls implements IService {

    private final StudentsFinishedRepository studentsFinishedRepository;
    private final MapperStudentFinished mapperStudentFinished;

    public ServiceImpls(StudentsFinishedRepository studentsFinishedRepository, MapperStudentFinished mapperStudentFinished) {
        this.studentsFinishedRepository = studentsFinishedRepository;
        this.mapperStudentFinished = mapperStudentFinished;
    }

    @Override
    public List<String> createStudentsFinished(List<StudentDTO> students) {

        for (StudentDTO student: students){
            Optional<StudentsFinished> stud = studentsFinishedRepository.findById(student.getId());
            if(stud.isEmpty()){
                StudentsFinished studentsFinishedCreate = mapperStudentFinished.studentDTOToStudenFinished(student);
                this.studentsFinishedRepository.save(studentsFinishedCreate);
            }

        }

        return List.of();
    }
}
