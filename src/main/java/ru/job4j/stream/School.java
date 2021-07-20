package ru.job4j.stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }
}
