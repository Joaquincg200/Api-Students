package com.joaquin.myBatch.mapper;

import com.joaquin.myBatch.entity.StudentsFinished;
import org.generator.model.StudentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperStudentFinished {
    @Mapping(source = "id", target = "idStudent")
    StudentsFinished studentDTOToStudenFinished(StudentDTO studentDTO);
    List<StudentsFinished> studentDTOToStudenFinished(List<StudentDTO> studentDTOS);
}
