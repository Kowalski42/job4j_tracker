package ru.job4j.collection;

import java.util.*;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl. task", 2),
                new Job("Impl. task", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println(jobs);
        List<Job> jobs2 = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Aix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs2, new SortByDescName().thenComparing(new SortByDescPriority()));
        System.out.println(jobs2);
        Comparator<Job> comb = new SortDescByNameLn()
                .thenComparing(new SortByDescName())
                .thenComparing(new SortByDescPriority());
        Collections.sort(jobs2, comb);
        System.out.println(jobs2);
    }
}
