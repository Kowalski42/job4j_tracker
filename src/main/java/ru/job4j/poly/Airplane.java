package ru.job4j.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Пассажиры летят на самолете");
    }

    @Override
    public int withholdPayment(int distance) {
        int payment = distance * 10;
        System.out.println("Стоимость перелета составила " + payment);
        return payment;
    }
}
