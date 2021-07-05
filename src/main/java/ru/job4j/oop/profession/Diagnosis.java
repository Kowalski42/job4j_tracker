package ru.job4j.oop.profession;

public class Diagnosis {
    private String name;
    private int id;

    public Diagnosis(String name) {
        this.name = name;
    }

    public Diagnosis(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
