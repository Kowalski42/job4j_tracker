package ru.job4j.lambda;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class FunctionInDiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionInDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenParabola() {
        List<Double> result = FunctionInDiapason.diapason(5, 8,
                x -> 2 * Math.pow(x, 2) + 5 * x + 1);
        List<Double> expected = Arrays.asList(76D, 103D, 134D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenPowerResults() {
        List<Double> result = FunctionInDiapason.diapason(2, 5, x -> Math.pow(10, x));
        List<Double> expected = Arrays.asList(100D, 1000D, 10000D);
        assertThat(result, is(expected));
    }
}