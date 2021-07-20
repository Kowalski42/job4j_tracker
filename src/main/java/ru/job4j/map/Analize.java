package ru.job4j.map;

import java.util.*;

public class Analize {
    public Info diff(List<User> previous, List<User> current) {
        Info info = new Info();
        info.added = (int) current.stream()
                //Oleg, Dmitriy, Inna from current
                .dropWhile(previous::contains)
                .count();
        info.deleted = (int) previous.stream()
                //Ivan, Olga from previous
                .filter(o -> !current.contains(o))
                .count();
        info.changed = (int) previous.stream()
                //Nikita
                .filter(current::contains)
                //Nikita has not the same indexes in current and previous, so index will be changed
                .filter(o -> !o.getName().equals(current.get(previous.indexOf(o)).getName()))
                .count();
        return info;
    }

    public static class User {
        int id;
        String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof User)) {
                return false;
            }
            User user = (User) o;
            return getId() == user.getId() && getName() == user.getName();
        }

        @Override
        public int hashCode() {
            return getId();
        }
    }

    public static class Info {
        int added;
        int changed;
        int deleted;

        @Override
        public String toString() {
            return "Info{"
                    + "added=" + added
                    + ", changed=" + changed
                    + ", deleted=" + deleted
                    + '}';
        }
    }
}