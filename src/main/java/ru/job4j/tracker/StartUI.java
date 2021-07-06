package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select: ");
            int select = -1;
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Incorrect format of input.");
            }
            switch (select) {
                case 0:
                    createNewItem(scanner, tracker);
                    break;
                case 1:
                    showAllItem(tracker);
                    break;
                case 2:
                    editItem(scanner, tracker);
                    break;
                case 3:
                    deleteItem(scanner, tracker);
                    break;
                case 4:
                    findItemById(scanner, tracker);
                    break;
                case 5:
                    findItemByName(scanner, tracker);
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("Please, select in the specified range.");
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    private void createNewItem(Scanner scanner, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("The new item has been added: " + item);
    }

    private void showAllItem(Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("There is no items in repository");
        }
    }

    private void editItem(Scanner scanner, Tracker tracker) {
        System.out.println("=== Edit item ====");
        System.out.print("Enter id: ");
        int id;
        try {
            id = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            Item item = new Item(name);
            if (tracker.replace(id, item)) {
                System.out.println("The item has been changed successfully.");
            } else {
                System.out.println("Item replacement error. The item with id "
                        + id + " is not been contains in repository.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Incorrect format of input.");
        }
    }

    private void deleteItem(Scanner scanner, Tracker tracker) {
        System.out.println("=== Delete item ====");
        System.out.print("Enter id: ");
        int id;
        try {
            id = Integer.parseInt(scanner.nextLine());
            if (tracker.delete(id)) {
                System.out.println("The item has been deleted successfully.");
            } else {
                System.out.println("Item delete error. The item with id "
                        + id + " is not been contains in repository.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Incorrect format of input.");
        }
    }

    private void findItemById(Scanner scanner, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        System.out.print("Enter id: ");
        int id;
        try {
            id = Integer.parseInt(scanner.nextLine());
            Item item = tracker.findById(id);
            if (item != null) {
                System.out.println(item);
            } else {
                System.out.println("The item with id " + id + " has not been found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Incorrect format of input.");
        }
    }

    private void findItemByName(Scanner scanner, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("The item(s) with name: " + name + " has not been found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
