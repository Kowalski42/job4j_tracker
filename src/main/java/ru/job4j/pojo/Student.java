package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String name;
    private String middleName;
    private String surname;
    private String group;
    private LocalDate entrance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getEntrance() {
        return entrance;
    }

    public void setEntrance(LocalDate entrance) {
        this.entrance = entrance;
    }
}
