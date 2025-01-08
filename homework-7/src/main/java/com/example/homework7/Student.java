package com.example.homework7;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//Änderung um zu Pushen
@Entity
public class Student {

    @Id
    private long Id;
    private String name;
    private String matNr;
    private String subject;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatNr() {
        return matNr;
    }

    public void setMatNr(String matNr) {
        this.matNr = matNr;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

//Push zum Testen und gucken ob bei MSB sichtbar TypeShi
