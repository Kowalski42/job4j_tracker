package ru.job4j.builder;

import ru.job4j.oop.Car;

public class Builder {
    private long number;
    private String bank;
    private String paymentSystem;
    private int dueMonth;
    private int dueYear;
    private int cvc;
    private String user;
    private long balance;

    Builder buildNumber(long number) {
        this.number = number;
        return this;
    }

    Builder buildBank(String bank) {
        this.bank = bank;
        return this;
    }

    Builder buildPaymentSystem(String paymentSystem) {
        this.paymentSystem = paymentSystem;
        return this;
    }

    Builder buildDueMonth(int dueMonth) {
        this.dueMonth = dueMonth;
        return this;
    }

    Builder buildDueYear(int dueYear) {
        this.dueYear = dueYear;
        return this;
    }

    Builder buildCvc(int cvc) {
        this.cvc = cvc;
        return this;
    }

    Builder buildUser(String user) {
        this.user = user;
        return this;
    }

    Builder buildBalance(long balance) {
        this.balance = balance;
        return this;
    }

    public Card build() {
        Card card = new Card();
        card.setNumber(number);
        card.setBank(bank);
        card.setPaymentSystem(paymentSystem);
        card.setDueMonth(dueMonth);
        card.setDueYear(dueYear);
        card.setCvc(cvc);
        card.setUser(user);
        card.setBalance(balance);
        return card;
    }
}
