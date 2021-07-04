package ru.job4j.oop.profession;

public class Programmer extends Engineer {
    private String programmingLanguage;
    private int workExperience;

    public void selfPresent() {
        System.out.println("Меня зовут " + this.getSurname() + this.getName()
            + "Я специализируюсь на разработке на " + programmingLanguage
            + " в течение " + workExperience + " лет.");
    }
}
