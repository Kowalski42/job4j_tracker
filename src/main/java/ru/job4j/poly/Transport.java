package ru.job4j.poly;

public interface Transport {
    void ride();

    void takePassengers(int passengers);

    int refuel(int volume);
}
