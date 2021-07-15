package ru.job4j.collection;

import java.util.*;

public class SortDescByNameLn implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o2.getName().length(), o1.getName().length());
    }
}
