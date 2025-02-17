package ru.job4j.tracker;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Item implements Cloneable {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();
    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name='" + name + '\''
                + ", created=" + created.format(formatter) + '}';
    }

    @Override
    public Item clone() throws CloneNotSupportedException {
        return (Item) super.clone();
    }
}