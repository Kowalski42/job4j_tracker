package ru.job4j.oop.profession;

import java.util.GregorianCalendar;

public class Builder extends Engineer {
    private String mainConstructions;

    public Builder(String name, String surname, String education, GregorianCalendar birthday) {
        super(name, surname, education, birthday);
    }

    public Builder(String name, String surname, String education, String mainConstructions, GregorianCalendar birthday) {
        super(name, surname, education, birthday);
        this.mainConstructions = mainConstructions;
    }

    public String getMainConstructions() {
        return mainConstructions;
    }

    public void build() {
        System.out.println("Я построил " + mainConstructions);
    }
}
