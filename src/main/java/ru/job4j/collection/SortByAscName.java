package ru.job4j.collection;

import ru.job4j.tracker.Item;

import java.util.Comparator;

public class SortByAscName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
