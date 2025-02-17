package ru.job4j.collection;

import java.util.*;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (var task: list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
