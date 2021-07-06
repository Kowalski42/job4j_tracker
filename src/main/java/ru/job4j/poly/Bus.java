package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Автобус едет");
    }

    @Override
    public void takePassengers(int passengers) {
        System.out.println("Внутри автобуса " + passengers + " человек");
    }

    @Override
    public int refuel(int volume) {
        int cost = volume * 70;
        System.out.println("Автобус заправлен на " + volume + " л топлива."
            + System.lineSeparator() + "Стоимость заправки составила: " + cost);
        return cost;
    }
}
