package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Пассажиры едут на поезде");
    }

    @Override
    public int withholdPayment(int distance) {
        int payment = distance * 50;
        System.out.println("Стоимость проезда на поезде составила " + payment);
        return payment;
    }
}
