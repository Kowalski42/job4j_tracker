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

    static class Builder {
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
            card.number = number;
            card.bank = bank;
            card.paymentSystem = paymentSystem;
            card.dueMonth = dueMonth;
            card.dueYear = dueYear;
            card.cvc = cvc;
            card.user = user;
            card.balance = balance;
            return card;
        }
    }
}
