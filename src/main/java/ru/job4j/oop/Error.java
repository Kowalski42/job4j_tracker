package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Есть ли ошибка: " + active);
        System.out.println("Номер ошибки: " + status);
        System.out.println("Важность: " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error err1 = new Error();
        err1.printInfo();
        Error err2 = new Error(false, 3, "ошибка низкого приоритета");
        err2.printInfo();
        Error err3 = new Error(true, 1, "ошибка высокого приоритета");
        err3.printInfo();
    }
}
