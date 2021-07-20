package ru.job4j.stream;

import org.junit.Test;

import java.util.*;
import java.util.function.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixToListTest {

    @Test
    public void whenTransform() {
        Integer[][] array = {{1, 10}, {5}, {15, 18, 29}, {30, 8}, {3}};
        List<Integer> rsl = new MatrixToList().transform(array);
        List<Integer> expected = Arrays.asList(1, 10, 5, 15, 18, 29, 30, 8, 3);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenNonTransform() {
        Integer[][] array = {{1, 10}, {5}, {15, 18, 29}, {30, 8}, {3}};
        List<Integer> rsl = new MatrixToList().transform(array);
        List<Integer> expected = Arrays.asList(1, 10, 5, 15, 18);
        assertNotSame(rsl, is(expected));
    }
}