package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item findById(int id) {
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                return items[i];
            }
        }
        return null;
    }

    public Item[] findByName(String key) {
        Item[] newItems = new Item[size];
        int tempSize = 0;
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                newItems[tempSize++] = items[i];
            }
        }
        return Arrays.copyOf(newItems, tempSize);
    }
}