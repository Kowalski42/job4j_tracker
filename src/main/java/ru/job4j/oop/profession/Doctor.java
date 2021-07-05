package ru.job4j.oop.profession;

import ru.job4j.oop.profession.Profession;

import java.util.GregorianCalendar;

public class Doctor extends Profession {
    private int levelOfPsychoStrength;

    public Doctor(String name, String surname, String education, GregorianCalendar birthday, int levelOfPsychoStrength) {
        super(name, surname, education, birthday);
        this.levelOfPsychoStrength = levelOfPsychoStrength;
    }

    public Diagnosis heal(Pacient pacient) {
        return pacient.getDiagnosis();
    }

    public void support(Pacient pacient) {
        System.out.println(pacient.getName() + ", ваше здоровье в ваших руках!");
    }
}
