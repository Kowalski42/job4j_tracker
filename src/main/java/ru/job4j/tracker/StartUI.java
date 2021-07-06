package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Select: ");
            switch (select) {
                case 0:
                    createNewItem(input, tracker);
                    break;
                case 1:
                    showAllItem(tracker);
                    break;
                case 2:
                    editItem(input, tracker);
                    break;
                case 3:
                    deleteItem(input, tracker);
                    break;
                case 4:
                    findItemById(input, tracker);
                    break;
                case 5:
                    findItemByName(input, tracker);
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

    private void createNewItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
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

    private void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("The item has been changed successfully.");
        } else {
            System.out.println("Item replacement error. The item with id "
                    + id + " is not been contains in repository.");
        }
    }

    private void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("The item has been deleted successfully.");
        } else {
            System.out.println("Item delete error. The item with id "
                    + id + " is not been contains in repository.");
        }
    }

    private void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("The item with id " + id + " has not been found.");
        }
    }

    private void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
