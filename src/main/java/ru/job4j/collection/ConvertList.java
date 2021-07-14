package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        int index = 0;
        for (int[] array : list) {
            for (int element: array) {
                rsl.add(index++, element);
            }
        }
        return rsl;
    }
}
