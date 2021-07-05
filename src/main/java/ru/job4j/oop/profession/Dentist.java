package ru.job4j.oop.profession;

import java.util.GregorianCalendar;

public class Dentist extends Doctor {
    private boolean canMakeImplantation;

    public Dentist(String name, String surname, String education, GregorianCalendar birthday,
                   int levelOfPsychoStrength, boolean canMakeImplantation) {
        super(name, surname, education, birthday, levelOfPsychoStrength);
        this.canMakeImplantation = canMakeImplantation;
    }

    public void implant(Pacient pacient) {
        System.out.println("Проведена имплатанция зуба у пациента: "
                + pacient.getName() + " " + pacient.getSurname()
                + System.lineSeparator() + "Врач: " + this.getName() + this.getSurname());
    }

    public boolean getCanMakeImplantation() {
        return canMakeImplantation;
    }
}
