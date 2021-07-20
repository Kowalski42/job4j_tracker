package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamStudent {
    public Map<String, Student> collect(List<Student> students) {
        return students.stream()
                .distinct()
                .collect(Collectors.toMap(s -> s.getSurname(), s -> s));
    }
}
