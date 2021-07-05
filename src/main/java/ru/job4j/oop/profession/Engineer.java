package ru.job4j.oop.profession;

import ru.job4j.oop.profession.Profession;

import java.util.GregorianCalendar;

public class Engineer extends Profession {

    public Engineer(String name, String surname, String education, GregorianCalendar birthday) {
        super(name, surname, education, birthday);
    }

}
