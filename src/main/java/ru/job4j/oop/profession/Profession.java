package ru.job4j.oop.profession;

import java.util.GregorianCalendar;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private GregorianCalendar birthday;

    public Profession(String name, String surname, String education, GregorianCalendar birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public GregorianCalendar getBirthday() {
        return birthday;
    }
}
