package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(
                new CreateAction(out),
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", Integer.toString(item.getId()), replacedName, "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new ReplaceAction(out),
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenFindByIdItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New item"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", Integer.toString(item.getId()), "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new FindByIdAction(out),
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu: " + System.lineSeparator()
                        + "0. Find item by id" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "=== Find item by id ====" + System.lineSeparator()
                        + item + System.lineSeparator()
                        + "Menu: " + System.lineSeparator()
                        + "0. Find item by id" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()));
    }

    @Test
    public void whenFindByNameItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("New item"));
        Item item2 = tracker.add(new Item("Simple item"));
        Item item3 = tracker.add(new Item("New item"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", item1.getName(), "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new FindByNameAction(out),
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu: " + System.lineSeparator()
                        + "0. Find items by name" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "=== Find items by name ====" + System.lineSeparator()
                        + item1 + System.lineSeparator()
                        + item3 + System.lineSeparator()
                        + "Menu: " + System.lineSeparator()
                        + "0. Find items by name" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()));
    }

    @Test
    public void whenShowAllItems() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("New item1"));
        Item item2 = tracker.add(new Item("New item2"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new ShowAllAction(out),
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu: " + System.lineSeparator()
                        + "0. Show all items" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "=== Show all items ====" + System.lineSeparator()
                        + item1 + System.lineSeparator()
                        + item2 + System.lineSeparator()
                        + "Menu: " + System.lineSeparator()
                        + "0. Show all items" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", Integer.toString(item.getId()), "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new DeleteAction(out),
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu: " + System.lineSeparator()
                        + "0. Exit Program" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"10", "0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(
                new Exit()
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu: " + ln
                        + "0. Exit Program" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu: " + ln
                        + "0. Exit Program" + ln
                )
        );
    }
}