package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByDescName() {
        Comparator<Job> cmpNamePriority = new SortByDescName();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, is(-3));
    }

    @Test
    public void whenCompatorByAscName() {
        Comparator<Job> cmpNamePriority = new SortByAscName();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, is(3));
    }

    @Test
    public void whenCompatorByDescNameAndDescPrority() {
        Comparator<Job> cmpNamePriority = new SortByDescName().
                thenComparing(new SortByDescPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByAscNameAndAscPrority() {
        Comparator<Job> cmpNamePriority = new SortByAscName().
                thenComparing(new SortByAscPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, is(3));
    }

    @Test
    public void whenCompatorByAscNameAndDescPrority() {
        Comparator<Job> cmpNamePriority = new SortByAscName().
                thenComparing(new SortByDescPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, is(3));
    }
}