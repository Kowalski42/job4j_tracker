package ru.job4j.oop;

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

    public static class Ball {
        public void rollTo(Wolf wolf) {
        }
        public void rollTo(Fox fox) {
        }
        public void rollTo(Hare hare) {
        }
    }

    public static class Wolf {
        public void tryEat(Ball ball) {
        }
    }

    public static class Hare {
        public void tryEat(Ball ball) {
        }
    }

    public static class Fox {
        public void tryEat(Ball ball) {
        }
        public void kill(Ball ball) {
        }
    }
}
