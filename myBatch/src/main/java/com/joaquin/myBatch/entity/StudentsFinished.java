package com.joaquin.myBatch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="students_finished")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentsFinished {

    @Id
    private Integer idStudent;

    private String name;

}