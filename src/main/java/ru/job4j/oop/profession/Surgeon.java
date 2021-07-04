package ru.job4j.oop.profession;

public class Surgeon extends Doctor {
    private String specialisation;

    public String getSpecialisation() {
        return this.specialisation;
    }

    public boolean operate(Pacient pacient) {
        return true;
    }
}
