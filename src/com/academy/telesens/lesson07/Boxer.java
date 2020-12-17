package com.academy.telesens.lesson07;

import com.academy.telesens.lesson05.oop.Person;

public class Boxer extends Person {
    public void fight() {
        System.out.println("boxing");
    }

    @Override
    public String getProfile() {
        return "I am a boxer";
    }

    @Override
    public String toString() {
        return "Boxer{}";
    }
}
