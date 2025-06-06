package com.joaquin.student.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "mail")
    private String mail;
    @Column(name = "fecha de nacimiento")
    private LocalDate date_born;
    @Column(name = "Terminado")
    private Boolean finished;

    public Student() {
    }

    public Student(String name, String mail, LocalDate date_born, Boolean finished) {
        this.name = name;
        this.mail = mail;
        this.date_born = date_born;
        this.finished = finished;
    }

    public Student(int id, String name, String mail, LocalDate date_born, Boolean finished) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.date_born = date_born;
        this.finished = finished;
    }

    public Integer getId() {
        return id;
    }

    public  void setId(Integer id) {
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
