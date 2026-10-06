package com.example.splab;

public class Paragraph extends Element {
    private String text;
    private AlignStrategy alignStrategy; // atributul pentru strategie[cite: 27]

    public Paragraph(String text) {
        this.text = text;
    }

    // Setter-ul necesar pentru schimbarea strategiei la runtime[cite: 27]
    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void print() {
        if (alignStrategy != null) {
            alignStrategy.render(this.text);
        } else {
            System.out.println("Paragraph: " + text);
        }
    }

    @Override
    public void add(Element element) { }

    @Override
    public void remove(Element element) { }

    @Override
    public Element get(int index) {
        return null;
    }
}