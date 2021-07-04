package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Философия Java", 1285);
        Book book2 = new Book("Java за 24 часа", 473);
        Book book3 = new Book("Наш код. Ремесло, профессия, искусство", 224);
        Book book4 = new Book("Clean code", 548);
        Book[] library = new Book[4];
        library[0] = book1;
        library[1] = book2;
        library[2] = book3;
        library[3] = book4;
        for (int index = 0; index < library.length; index++) {
            System.out.println(library[index].getName() + " - " + library[index].getPageCount());
        }
        System.out.println("\nSwap element1 & element4 in library");
        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;
        for (int index = 0; index < library.length; index++) {
            System.out.println(library[index].getName() + " - " + library[index].getPageCount());
        }
        System.out.println("\nShown only Book.name == \"Clean code\"");
        for (int index = 0; index < library.length; index++) {
            Book b = library[index];
            if (b.getName().equals("Clean code")) {
                System.out.println(b.getName() + " - " + b.getPageCount());
            }
        }
    }
}
