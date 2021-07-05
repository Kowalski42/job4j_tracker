package ru.job4j.oop.profession;

import java.util.GregorianCalendar;

public class Pacient {
    private String name;
    private String surname;
    private GregorianCalendar birthday;
    private Diagnosis diagnosis;

    public Pacient(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Pacient(String name, String surname, Diagnosis diagnosis) {
        this(name, surname);
        this.diagnosis = diagnosis;
    }

    public Pacient(String name, String surname, GregorianCalendar birthday, Diagnosis diagnosis) {
        this(name, surname, diagnosis);
        this.birthday = birthday;
    }

    public Diagnosis getDiagnosis() {
        return this.diagnosis;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public GregorianCalendar getBirthday() {
        return this.birthday;
    }
}
