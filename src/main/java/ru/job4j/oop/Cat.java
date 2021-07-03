package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;

    public void show() {
        System.out.println("The cat's name is " + this.name);
        System.out.println("Today it's eaten a " + this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("cutlet");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Chernysh");
        black.eat("fish");
        black.show();
    }
}
