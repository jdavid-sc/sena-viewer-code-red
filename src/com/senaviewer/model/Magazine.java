package com.senaviewer.model;

import java.util.List;

public class Magazine {

    private static int idCounter = 1;

    private int id;
    private String title;
    private String editionDate;
    private String editorial;
    private List<String> authors;

    public Magazine(String title, String editionDate, String editorial) {
        this.id = idCounter++;
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Revista ID: " + id +
                ", Título: " + title +
                ", Fecha de edición: " + editionDate +
                ", Editorial: " + editorial +
                ", Autores: " + (authors != null ? authors : "Ninguno");
    }
}
