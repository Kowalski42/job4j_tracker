package ru.job4j.function;

import java.util.*;
import java.util.function.*;

public class SearchFolder {
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> rsl = new ArrayList<>();
        //Consumer<Folder> consumer = (f) -> rsl.add(f);
        //list.forEach(consumer);
        for (Folder f : list) {
            if (pred.test(f)) {
                rsl.add(f);
            }
        }
        return rsl;
    }
}
