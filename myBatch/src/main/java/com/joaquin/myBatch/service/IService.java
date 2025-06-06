package com.joaquin.myBatch.service;

import org.generator.model.StudentDTO;

import java.util.List;

public interface IService {
    List<String> createStudentsFinished(List<StudentDTO> students);
}
