package com.example.splab;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println("Autor: " + name + " " + surname);
    }
}

