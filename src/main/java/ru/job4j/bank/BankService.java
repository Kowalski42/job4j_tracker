package ru.job4j.bank;

import java.util.*;

/**
 * Класс предназначен для работы со счетами банка
 * @author ELENA LOSKUTNIKOVA
 * @version 1.0
 */
public class BankService {
    /**
     * В коллекции HashMap users храняется клиенты банка с набором счетов каждого клиента
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет в HashMap users новых клиентов с набором счетов.
     * Если клиент с таким паспортом уже есть в HashMap, то он добавлен не будет.
     * @param user клиент, которого требуется добавить в HashMap users.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет в List<Account> клиента нужный счет.
     * Если клиент является текущим и есть в HashMap users, а нового счета по предлагаемым
     * реквизитам нет в наборе счетов данного клиента, то счет будет добавлен.
     * @param passport реквизиты паспорта клиента, которому требуется добавить счет.
     * @param account счет (с реквизитами и баласом), который будет добавлен.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод позволяет найти клиента по реквизитам его паспорта среди HashMap users.
     * @param passport реквизиты паспорта искомого клиента.
     * @return возвращает объект клиента с реквизитами паспорта и ФИО
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод позволяет найти счет по реквизитам паспорта клиента и реквизитам счета
     * среди HashMap users.
     * @param passport паспорт клиента, у которого осуществляется поиск счета.
     * Если клиента с указанным паспортом нет в HashMap users, то метод возвращает null.
     * @param requisite реквизиты счета, поиск которого осуществляется.
     * @return возвращает найденный объект счета с реквизитами и балансом, если счет
     * с искомыми реквизитами не найден, то метод возвращает null.
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get())
                    .stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
    }

    /**
     * Метод позволяет осуществить перевод денежных средств между счетами клиентов,
     * которые содержатся HashMap users.
     * @param srcPassport паспорт клиента, со счета которого осуществляется перевод средств.
     * @param destPassport паспорт клиента, на счет которого зачисляются средства.
     * Если хотя бы одного из клиентов нет в HashMap users, то метод возвращает false
     * и перевод не будет осуществлен.
     * @param srcRequisite реквизиты счета клиента-отправителя, с которого
     * будет осуществлен перевод.
     * @param destRequisite реквизиты счета клиента-получателя, на который
     * будет зачислен перевод.
     * Если хотя бы один из счетов не найден в HashMap users, то метод возвращает false
     * и перевод не будет осуществлен.
     * @return возвращает true, если перевод осущесвлен (с одного счета денежные средства списаны,
     * а на другой счет в аналогичной сумме зачислены).
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount;
        Account destAccount;
        if (findByRequisite(srcPassport, srcRequisite).isPresent()) {
            srcAccount = findByRequisite(srcPassport, srcRequisite).get();
            if (findByRequisite(destPassport, destRequisite).isPresent()
                    && srcAccount.getBalance() - amount >= 0) {
                destAccount = findByRequisite(destPassport, destRequisite).get();
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                destAccount.setBalance(destAccount.getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }
}
