package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        int data = 10;
        int result = Calculator.sum(data);
        System.out.println(result + " - результат суммирования " + data + " и 5");
        result = Calculator.minus(data);
        System.out.println(result + " - результат вычитания 5 из " + data);
        Calculator calc = new Calculator();
        result = calc.multiply(data);
        System.out.println(result + " - результат произведения " + data + " и 5");
        result = calc.divide(data);
        System.out.println(result + " - результат деления " + data + " на 5");
        result = calc.sumAllOperation(data);
        System.out.println(result + " - сумма всех операций");
    }
}
