package ru.job4j.builder;

public class Card {
    private long number;
    private String bank;
    private String paymentSystem;
    private int dueMonth;
    private int dueYear;
    private int cvc;
    private String user;
    private long balance;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getPaymentSystem() {
        return paymentSystem;
    }

    public void setPaymentSystem(String paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public int getDueMonth() {
        return dueMonth;
    }

    public void setDueMonth(int dueMonth) {
        this.dueMonth = dueMonth;
    }

    public int getDueYear() {
        return dueYear;
    }

    public void setDueYear(int dueYear) {
        this.dueYear = dueYear;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{"
                + "number=" + number
                + ", bank='" + bank + '\''
                + ", paymentSystem='" + paymentSystem + '\''
                + ", dueMonth=" + dueMonth
                + ", dueYear=" + dueYear
                + ", cvc=" + cvc
                + ", user='" + user + '\''
                + ", balance=" + balance
                + '}';
    }
}
