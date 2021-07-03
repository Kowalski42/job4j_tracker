package ru.job4j.oop.BallStory;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare zaychik = new Hare();
        Wolf seryi = new Wolf();
        Fox alisa = new Fox();
        kolobok.rollTo(zaychik);
        zaychik.tryEat(kolobok);
        kolobok.rollTo(seryi);
        seryi.tryEat(kolobok);
        kolobok.rollTo(alisa);
        alisa.tryEat(kolobok);
        alisa.kill(kolobok);
    }
}
