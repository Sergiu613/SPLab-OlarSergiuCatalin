package com.example.splab;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents extends Element {
    private List<String> entries = new ArrayList<>();

    public TableOfContents() {
    }

    public void addEntry(String title, int page) {
        entries.add(title + " .................... Pagina " + page);
    }

    public List<String> getEntries() {
        return entries;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void print() {
        System.out.println(" Table of Contents ");
        for (String entry : entries) {
            System.out.println(entry);
        }
        System.out.println();
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException();
    }
}