package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Аркадий");
        student1.setMiddleName("Савельевич");
        student1.setSurname("Люблянский");
        student1.setGroup("ПМ-1");
        student1.setEntrance(LocalDate.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(student1.getName() + " " + student1.getMiddleName() + " "
                + student1.getSurname() + " " + student1.getGroup() + " "
                + (student1.getEntrance()).format(formatter));
    }
}
