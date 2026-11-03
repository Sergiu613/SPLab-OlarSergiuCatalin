package com.example.splab;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "parent_id")
    protected Element parent = null;

    public Element() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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