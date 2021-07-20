package ru.job4j.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }

    public static void main(String[] args) {
        List<Card> cards = Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values()).map(value -> new Card(suit, value)))
                .collect(Collectors.toList());
        cards.stream()
                .forEach(System.out::println);
    }
}
