package ru.job4j.lambda;

import java.util.*;

public class LambdaUsage {
    public static void main(String[] args) {
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + right.length() + " : " + left.length());
            return Integer.compare(right.length(), left.length());
        };
        List<String> list = Arrays.asList("Fish", "Cat", "Tasks");
        list.sort(comparator);
        System.out.println(list);
    }
}
