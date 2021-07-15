package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) throws NullPointerException {
        if (left == null || right == null) {
            throw new NullPointerException();
        }
        char[] leftArray = left.toCharArray();
        char[] rightArray = right.toCharArray();
        if (leftArray.length > rightArray.length) {
            rightArray = Arrays.copyOf(rightArray, leftArray.length);
        } else {
            leftArray = Arrays.copyOf(leftArray, rightArray.length);
        }
        for (int i = 0; i < leftArray.length; i++) {
            if (leftArray[i] - rightArray[i] > 0 || leftArray[i] - rightArray[i] < 0) {
                return leftArray[i] - rightArray[i];
            }
        }
        return 0;
    }
}
