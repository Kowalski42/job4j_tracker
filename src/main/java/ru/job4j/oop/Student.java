package ru.job4j.oop;

public class Student {

    public void playMusic() {
        System.out.println("Tra tra tra");
    }

    public void singSong() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 0; i < 3; i++) {
            petya.playMusic();
            petya.singSong();
        }
    }
}
