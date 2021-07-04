package ru.job4j.oop.profession;

import ru.job4j.oop.profession.Profession;

public class Doctor extends Profession {

    public Diagnosis heal(Pacient pacient) {
        return pacient.getDiagnosis();
    }

    public void support(Pacient pacient) {
        System.out.println(pacient.getName() + ", ваше здоровье в ваших руках!");
    }
}
