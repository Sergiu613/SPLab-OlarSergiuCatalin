package com.example.splab;

public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Nodurile frunza nu pot adauga elemente.");
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException("Nodurile frunza nu pot sterge elemente.");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Nodurile frunza nu contin elemente copil.");
    }
}
