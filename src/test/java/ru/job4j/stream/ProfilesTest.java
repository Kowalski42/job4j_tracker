package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void whenCollect() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Moscow", "Arbat", 10, 185)),
                new Profile(new Address("Smolensk", "Lenina", 45, 5)),
                new Profile(new Address("Kursk", "Kulibina", 7, 38)),
                new Profile(new Address("Moscow", "Dubravnaya", 40, 343)),
                new Profile(new Address("Smolensk", "Chernyahovskogo", 1, 71))
        );
        List<Address> rsl = new Profiles().collect(profiles);
        List<Address> temp = List.of(
                new Address("Moscow", "Arbat", 10, 185),
                new Address("Smolensk", "Lenina", 45, 5),
                new Address("Kursk", "Kulibina", 7, 38),
                new Address("Moscow", "Dubravnaya", 40, 343),
                new Address("Smolensk", "Chernyahovskogo", 1, 71)
        );
        assertThat(rsl, is(temp));
    }

    @Test
    public void whenNonCollect() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Moscow", "Arbat", 10, 185)),
                new Profile(new Address("Smolensk", "Lenina", 45, 5)),
                new Profile(new Address("Kursk", "Kulibina", 7, 38)),
                new Profile(new Address("Moscow", "Dubravnaya", 40, 343)),
                new Profile(new Address("Smolensk", "Chernyahovskogo", 1, 71))
        );
        List<Address> rsl = new Profiles().collect(profiles);
        List<Address> temp = List.of(
                new Address("Moscow", "Arbat", 10, 185),
                new Address("Moscow", "Dubravnaya", 40, 343),
                new Address("Smolensk", "Lenina", 45, 5),
                new Address("Kursk", "Kulibina", 7, 38),
                new Address("Smolensk", "Chernyahovskogo", 1, 71)
        );
        assertNotSame(rsl, is(temp));
    }
}