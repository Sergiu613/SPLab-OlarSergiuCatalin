package com.example.splab;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Section extends Element {

    protected String title;

    @OneToMany(targetEntity = Element.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    protected List<Element> children = new ArrayList<>();

    public Section() {
    }

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<Element> getChildren() {
        return children;
    }

    @Override
    public void add(Element element) {
        children.add(element);
        element.setParent(this);
    }

    @Override
    public void remove(Element element) {
        children.remove(element);
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element child : children) {
            child.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element child : children) {
            child.accept(visitor);
        }
    }
}