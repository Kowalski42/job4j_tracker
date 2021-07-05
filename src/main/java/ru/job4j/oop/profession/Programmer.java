package ru.job4j.oop.profession;

import java.util.GregorianCalendar;

public class Programmer extends Engineer {
    private String programmingLanguage;
    private int workExperience;

    public Programmer() {
        super();
    }

    public Programmer(String name, String surname, String education, GregorianCalendar birthday) {
        super(name, surname, education, birthday);
    }

    public Programmer(String name, String surname, String education, GregorianCalendar birthday,
                      String programmingLanguage, int workExperience) {
        super(name, surname, education, birthday);
        this.programmingLanguage = programmingLanguage;
        this.workExperience = workExperience;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void selfPresent() {
        System.out.println("Меня зовут " + this.getSurname() + this.getName()
            + "Я специализируюсь на разработке на " + programmingLanguage
            + " в течение " + workExperience + " лет.");
    }
}
