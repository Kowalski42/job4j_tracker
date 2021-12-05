package ru.job4j.stream;

import java.util.List;

public class Pupil {
    private String name;
    private List<Subject> subjects;

    public Pupil(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pupil pupil = (Pupil) o;
        if (name != null ? !name.equals(pupil.name) : pupil.name != null) {
            return false;
        }
        return subjects != null ? subjects.equals(pupil.subjects) : pupil.subjects == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (subjects != null ? subjects.hashCode() : 0);
        return result;
    }
}
