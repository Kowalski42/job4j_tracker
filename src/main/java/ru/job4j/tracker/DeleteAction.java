package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ====");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            out.println("The item has been deleted successfully.");
        } else {
            out.println("Item delete error. The item with id "
                    + id + " is not been contains in repository.");
        }
        return true;
    }
}
