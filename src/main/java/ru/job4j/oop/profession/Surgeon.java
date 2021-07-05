package ru.job4j.oop.profession;

import java.util.GregorianCalendar;

public class Surgeon extends Doctor {
    private String specialisation;

    public Surgeon() {
        super();
    }

    public Surgeon(String name, String surname, String education, GregorianCalendar birthday) {
        super(name, surname, education, birthday);
    }

    public Surgeon(String name, String surname, String education, String specialisation,
                   GregorianCalendar birthday) {
        super(name, surname, education, birthday);
        this.specialisation = specialisation;
    }

    public String getSpecialisation() {
        return this.specialisation;
    }

    public boolean operate(Pacient pacient) {
        return true;
    }
}
