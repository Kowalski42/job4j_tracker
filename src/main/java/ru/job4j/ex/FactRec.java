package ru.job4j.ex;

public class FactRec {
    public static int calc(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("В качестве аргумента может быть использовано "
                    + "только целое положительное число");
        } else if (n <= 1) {
            return 1;
        } else {
            return calc(n - 1) * n;
        }
    }

    public static void main(String[] args) throws IllegalArgumentException {
        int rsl = calc(-1);
        System.out.println(rsl);
    }
}
