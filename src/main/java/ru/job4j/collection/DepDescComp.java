package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] temp1 = o1.split("/");
        String[] temp2 = o2.split("/");
        int temp = temp2[0].compareTo(temp1[0]);
        if (temp != 0) {
            return temp;
        }
        for (int i = 1; i < Math.min(temp1.length, temp2.length); i++) {
            temp = temp1[i].compareTo(temp2[i]);
            if (temp != 0) {
                return temp;
            }
        }
        return Integer.compare(o1.length(), o2.length());
    }
}
