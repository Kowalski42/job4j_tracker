package ru.job4j.poly;

public class MoveStation {
    public static void main(String[] args) {
        Vehicle vh1 = new Train();
        Vehicle vh2 = new Train();
        Vehicle vh3 = new Airplane();
        Vehicle vh4 = new Bus();
        Vehicle vh5 = new Airplane();
        Vehicle[] station = {vh1, vh2, vh3, vh4, vh5};
        for (int i = 0; i < station.length; i++) {
            System.out.println(station[i].getClass().getSimpleName());
            station[i].move();
            station[i].withholdPayment((i + 1) * 100);
            System.out.println();
        }
    }
}
