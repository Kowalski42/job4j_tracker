package ru.job4j.stream;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> list = List.of(-100, 53, -47, 1083, 500);
        List<Integer> list2 = list.stream().filter(i -> i > 0).collect(Collectors.toList());
        System.out.println(list2.toString());
    }
}
