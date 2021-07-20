package ru.job4j.map;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Analize analize = new Analize();
        java.util.List<Analize.User> previous = List.of(new Analize.User(25, "Ivan"),
                new Analize.User(30, "Nikita"),
                new Analize.User(32, "Olga"));
        List<Analize.User> current = List.of(new Analize.User(40, "Dmitryi"),
                new Analize.User(14, "Oleg"),
                new Analize.User(30, "Nikita"),
                new Analize.User(32, "Olga"),
                new Analize.User(20, "Inna"));
        System.out.println(analize.diff(previous, current));
    }
}
