package ru.job4j.oop.profession;

public class Dentist extends Doctor {
    private boolean canMakeImplantation;

    public void implant(Pacient pacient) {
        System.out.println("Проведена имплатанция зуба у пациента: "
                + pacient.getName() + " " + pacient.getSurname()
                + "\nВрач: " + this.getName() + this.getSurname());
    }

    public boolean getCanMakeImplantation() {
        return canMakeImplantation;
    }
}
