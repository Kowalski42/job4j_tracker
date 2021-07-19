package ru.job4j.stream;

import org.junit.Test;

import java.util.*;
import java.util.function.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StreamStudentTest {

    @Test
    public void whenCollect() {
        List<Student> students = List.of(
                new Student(60, "Smirnov"),
                new Student(90, "Ivanov"),
                new Student(50, "Kudimov"),
                new Student(90, "Ivanov"),
                new Student(60, "Smirnov")
        );
        Map<String, Student> rsl = new StreamStudent().collect(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Smirnov", new Student(60, "Smirnov"));
        expected.put("Ivanov", new Student(90, "Ivanov"));
        expected.put("Kudimov", new Student(50, "Kudimov"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenNonCollect() {
        List<Student> students = List.of(
                new Student(60, "Smirnov"),
                new Student(90, "Ivanov"),
                new Student(50, "Kudimov"),
                new Student(90, "Ivanov"),
                new Student(60, "Smirnov")
        );
        Map<String, Student> rsl = new StreamStudent().collect(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Smirnov", new Student(60, "Smirnov"));
        expected.put("Ivanov", new Student(90, "Ivanov"));
        expected.put("Kudimov", new Student(50, "Kudimov"));
        expected.put("Chumakov", new Student(30, "Chumakov"));
        assertNotSame(rsl, is(expected));
    }

    @Test
    public void whenNonCollectSize() {
        List<Student> students = List.of(
                new Student(60, "Smirnov"),
                new Student(90, "Ivanov"),
                new Student(50, "Kudimov"),
                new Student(90, "Ivanov"),
                new Student(60, "Smirnov")
        );
        Map<String, Student> rsl = new StreamStudent().collect(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Smirnov", new Student(60, "Smirnov"));
        expected.put("Ivanov", new Student(90, "Ivanov"));
        expected.put("Kudimov", new Student(50, "Kudimov"));
        expected.put("Chumakov", new Student(30, "Chumakov"));
        assertNotSame(rsl.size(), is(expected.size()));
    }
}