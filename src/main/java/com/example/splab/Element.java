package com.example.splab;

public abstract class Element {
    // Referința către părinte
    protected Element parent = null;

    public Element getParent() {
        return parent;
    }

    public void setParent(Element parent) {
        this.parent = parent;
    }

    // Metodele devin abstracte (vor fi implementate de clasele copil)
    public abstract void print();
    public abstract void add(Element element);
    public abstract void remove(Element element);
    public abstract Element get(int index);
}