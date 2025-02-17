package ru.job4j.tracker;

import java.util.*;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu: ");
        for (UserAction u : actions) {
            out.println(actions.indexOf(u) + ". " + u.name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(new CreateAction(output),
                new ShowAllAction(output), new ReplaceAction(output),
                new DeleteAction(output), new FindByIdAction(output),
                new FindByNameAction(output), new Exit());
        new StartUI(output).init(input, tracker, actions);
    }
}
