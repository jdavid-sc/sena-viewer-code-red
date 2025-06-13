package com.senaviewer.model;

public class Publication {
    protected String title;
    protected String publisher;
    protected int year;

    public Publication(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Título: " + title + ", Editorial: " + publisher + ", Año: " + year;
    }
}
