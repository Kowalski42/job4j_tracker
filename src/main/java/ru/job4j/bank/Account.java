package ru.job4j.bank;

import java.util.*;

/**
 * Класс предназначен для работы с объектами счетов
 * @author ELENA LOSKUTNIKOVA
 * @version 1.0
 */
public class Account {
    /**
     * В данном поле осуществляется хранение реквизитов.
     */
    private String requisite;

    /**
     * В данном поле осуществляется хранения баланса счета.
     */
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод позволяет определить совпадает ли текущий счет с тем,
     * что выступает в качества параметра.
     * Если встречаются 2 счета с одинаковыми реквизитами, то они
     * представляют собой одинаковые объекты.
     * @param o счет, с которым совпадает или нет, экземпляр класса,
     * в отношении которого вызван метод.
     * @return возвращает true, если оба счета имеют одинаковые реквизиты.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
