package ru.job4j.tracker;

import java.time.*;
import java.time.format.*;
import java.util.Arrays;

public class StartUI {
    public static void main(String[] args) {
        Item item1 = new Item();
        LocalDateTime currentDateTime = item1.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(currentDateTime.format(formatter));
    }
}
