package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("The item has been deleted successfully.");
            return true;
        } else {
            System.out.println("Item delete error. The item with id "
                    + id + " is not been contains in repository.");
            return false;
        }
    }
}
