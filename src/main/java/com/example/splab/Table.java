package com.example.splab;

import jakarta.persistence.Entity;

@Entity
@jakarta.persistence.Table(name = "book_tables")
public class Table extends Element {
    private String something;

    public Table() {
    }

    public Table(String something) {
        this.something = something;
    }

    public String getSomething() {
        return something;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void print() {
        System.out.println("Table: " + something);
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