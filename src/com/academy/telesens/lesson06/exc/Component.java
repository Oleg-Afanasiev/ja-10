package com.academy.telesens.lesson06.exc;

public abstract class Component {
    private String text;

    public Component(String text) {
        this.text = text;
    }

    public abstract void draw();
}
