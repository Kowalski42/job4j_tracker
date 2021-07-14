package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        for (var element : tasks) {
            if (task.getPriority() <= element.getPriority()) {
                this.tasks.add(index, task);
                return;
            }
            index++;
        }
        tasks.add(task);
    }

    public Task take() {
        return tasks.poll();
    }
}

