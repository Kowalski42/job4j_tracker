package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().distinct().map(profile -> profile.getAddress())
                .collect(Collectors.toList());
    }
}
