package ru.job4j.bank;

import java.util.*;

/**
 * Класс предназначен для работы с объектами клиентов
 * @author ELENA LOSKUTNIKOVA
 * @version 1.0
 */
public class User {
    /**
     * В данном поле осуществляется хранение реквизитов паспорта: серии, номера,
     * даты выдачи, органа, выдавшего паспорт.
     */
    private String passport;

    /**
     * В данном поле осуществляется хранение ФИО клиента.
     */
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод позволяет определить, об одном и том же клиенте идет речь.
     * Если встречаются 2 клиента с одинаковыми реквизитами паспорта, то
     * это один и тот же клиент.
     * @param o клиент, с которым совпадает или нет, экземпляр класса клиент,
     * в отношении которого вызван метод.
     * @return возвращает true, если оба клиента имеют одинаковые паспорта.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
