package com.senaviewer.model;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Book book1 = new Book("Cien años de soledad", "1967", "Sudamericana", "978-3-16-148410-0");

        book1.setAuthors(Arrays.asList("Gabriel García Márquez"));

        book1.setReaded(true);

        book1.setTimeReaded(320);

        System.out.println(book1);
    }
}
