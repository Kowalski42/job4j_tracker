package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = task.getPriority();
        for (int i = 0; i < tasks.size(); i++) {
            if (index <= tasks.get(i).getPriority()) {
                tasks.add(i, task);
                break;
            }
        }
    }

    public Task take() {
        return tasks.poll();
    }
}

