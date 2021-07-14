package ru.job4j.list;

import java.util.*;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for (int[] row : array) {
            for (int cell : row) {
                list.add(index++, cell);
            }
        }
        return list;
    }
}
