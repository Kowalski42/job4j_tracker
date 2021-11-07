package ru.job4j.collection;

import java.util.*;
import static java.util.Collections.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start += ("".equals(start)) ? el : ("/" + el);
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> deps) {
        sort(deps);
    }

    public static void sortDesc(List<String> deps) {
        deps.sort(new DepDescComp());
    }
}
