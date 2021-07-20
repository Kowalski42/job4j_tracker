package ru.job4j.stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {
    public List<Integer> transform(Integer[][] data) {
        return Stream.of(data)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}
