package com.example.splab;

public abstract class Element {
    protected Element parent = null;

    public Element getParent() {
        return parent;
    }

    public void setParent(Element parent) {
        this.parent = parent;
    }

    public abstract void print();
    public abstract void accept(Visitor visitor);
    public abstract void add(Element element);
    public abstract void remove(Element element);
    public abstract Element get(int index);
}