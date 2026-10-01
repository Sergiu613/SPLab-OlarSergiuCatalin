package com.example.splab;
import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private List<Author> authors = new ArrayList<>();

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }
        System.out.println();

        // Apelul catre logica clasei parinte pentru a itera prin copii (punctul d)
        for (Element child : children) {
            child.print();
        }
    }
}
