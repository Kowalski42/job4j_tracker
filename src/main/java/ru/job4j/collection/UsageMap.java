package ru.job4j.collection;

import java.util.*;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Arsentev Petr Sergeevich");
        map.put("anikonova@mail.ru", "Nikonova Arina Ivanovna");
        map.put("vshpigel@rambler.ru", "Shpigel Vlad Isakovich");
        map.put("anikonova@mail.ru", "Surmina Arina Ivanovna");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("key - " + key + "; value - " + value);
        }
    }
}
