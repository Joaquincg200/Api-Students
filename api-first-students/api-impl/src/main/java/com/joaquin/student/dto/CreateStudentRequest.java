package com.joaquin.student.dto;


import java.time.LocalDate;

public class CreateStudentRequest {
    private String name;
    private String mail;
    private LocalDate date_born;
    private Boolean finished;

    public CreateStudentRequest(String name, String mail, LocalDate date_born,Boolean finished) {
        this.name = name;
        this.mail = mail;
        this.date_born = date_born;
        this.finished = finished;
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
