package ru.job4j.oop.profession;

import java.util.GregorianCalendar;

public class Surgeon extends Doctor {
    private String specialisation;

    public Surgeon(String name, String surname, String education, String specialisation,
                   GregorianCalendar birthday, int levelOfPsychoStrength) {
        super(name, surname, education, birthday, levelOfPsychoStrength);
        this.specialisation = specialisation;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public boolean operate(Pacient pacient) {
        return true;
    }
}
