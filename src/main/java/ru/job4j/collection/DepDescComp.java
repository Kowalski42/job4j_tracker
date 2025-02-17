package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] temp1 = o1.split("/");
        String[] temp2 = o2.split("/");
        int temp = temp2[0].compareTo(temp1[0]);
        return temp != 0 ? temp : o1.compareTo(o2);
    }
}
