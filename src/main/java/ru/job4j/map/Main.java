package ru.job4j.map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Student, Set<Subject>> students = Map.of(new Student("Student", "000001", "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                )
        );
        College college = new College(students);
        Student student = college.findByAccount("000001").get();
        System.out.println("Найденный студент: " + student);
        Subject english = college.findBySubjectName("000001", "English").get();
        System.out.println("Оценка по найденному предмету: " + english.getScore());
    }
}
