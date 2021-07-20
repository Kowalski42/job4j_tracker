package ru.job4j.builder;

public class Main {
    public static void main(String[] args) {
        Card card = new Builder().buildNumber(12365489L)
                .buildBank("Sberbank")
                .buildPaymentSystem("Mir")
                .buildDueMonth(12)
                .buildDueYear(2025)
                .buildCvc(100)
                .buildUser("Stepanov Mikhail Ivanovich")
                .buildBalance(250_000)
                .build();
        System.out.println(card);
    }
}
