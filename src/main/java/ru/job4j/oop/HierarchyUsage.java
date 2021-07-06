package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        /* создаем объекта класса Airplane. */
        Car car = new Car();
        /* делаем приведение к типу родителя Transport. */
        Transport tr = car;
        /* делаем приведение к типу родителя Object. */
        Object obj = car;
        /* Приведение типа при создании объекта. */
        Object oCar = new Car();
        /* Приведение типа за счет понижения по иерархии. */
        Car carFromObject = (Car) oCar;
        /* Ошибка в приведении типа. */
        Object bicycle = new Bicycle();
        //Airplane cb = (Airplane) bicycle; // код завершится с ошибок приведения типов ClassCastException
    }
}
