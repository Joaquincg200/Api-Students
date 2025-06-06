package com.joaquin.student.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.ToString;

import java.time.LocalDate;




@ToString
@Builder
public class StudentDTO {
    private int id;
    @Schema(description = "Nombre del estudiante", example = "Pepe Reina")
    private String name;
    @Schema(description = "Email del estudiante", example = "pepereina@gmail.com")
    private String mail;
    @Schema(description = "Fecha de nacimiento del alumno", example = "2000-05,05")
    private LocalDate date_born;
    @Schema(description = "Si el estudiante ha terminado los estudios", example = "true")
    private Boolean finished;


    public StudentDTO() {
    }

    public StudentDTO(int id ,String name, String mail, LocalDate date_born, Boolean finished) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.date_born = date_born;
        this.finished = finished;
    }

    public int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getDate_born() {
        return date_born;
    }

    public void setDate_born(LocalDate date_born) {
        this.date_born = date_born;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }
}
