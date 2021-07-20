package ru.job4j.stream;

import ru.job4j.collection.Job;

import java.util.*;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        Comparator<Profile> comp = (left, right) ->
                left.getAddress().getCity().compareTo(right.getAddress().getCity());
        List<Address> list = profiles.stream().sorted(comp)
                .distinct()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
        return list;
    }
}
