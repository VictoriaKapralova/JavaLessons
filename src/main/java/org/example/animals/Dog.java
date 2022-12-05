package org.example.animals;

public class Dog extends Mammals implements Predator {
    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats dog food");

    }

    @Override
    public String sound() {
        return "Bark!";
    }

    @Override
    public void consume(String prey) {
        System.out.println("Dog eats " + prey );

    }
}
