package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamStudent {
    public Map<String, Student> collect(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(s -> s.getSurname(), s -> s, (s1, s2) -> s1));
    }
}
