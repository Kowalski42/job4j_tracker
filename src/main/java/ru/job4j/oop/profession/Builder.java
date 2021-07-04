package ru.job4j.oop.profession;

public class Builder extends Engineer {
    private String mainConstructions;

    public void build() {
        System.out.println("Я построил " + mainConstructions);
    }
}
