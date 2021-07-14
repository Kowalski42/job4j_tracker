package ru.job4j.collection;

import java.awt.image.BandCombineOp;
import java.util.*;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account account: accounts) {
            rsl.add(account);
        }
        return rsl;
    }
}
