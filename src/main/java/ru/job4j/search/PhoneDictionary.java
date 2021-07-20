package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> predicateByName = p -> p.getName().contains(key);
        Predicate<Person> predicateBySurname = p -> p.getSurname().contains(key);
        Predicate<Person> predicateByAddress = p -> p.getAddress().contains(key);
        Predicate<Person> predicateByPhone = p -> p.getPhone().contains(key);
        Predicate<Person> combine = predicateByPhone.or(predicateByAddress.
                or(predicateBySurname.or(predicateByName)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person: persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
