package com.example.splab;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;

@Entity
public class Paragraph extends Element {
    private String text;

    @Transient
    private AlignStrategy alignStrategy;

    public Paragraph() {
    }

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
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