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
        Item[] newItems = new Item[items.length];
        int size = 0;
        for (Item i: items) {
            if (i != null) {
                newItems[size++] = i;
            }
        }
        return Arrays.copyOf(newItems, size);
    }

    public Item findById(int id) {
        for (Item i: items) {
            if (i != null && i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public Item[] findByName(String key) {
        Item[] newItems = new Item[items.length];
        int size = 0;
        for (Item i: items) {
            if (i != null && key.equals(i.getName())) {
                newItems[size++] = i;
            }
        }
        return Arrays.copyOf(newItems, size);
    }
}