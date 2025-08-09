package com.wipro.oop;

public abstract class Animal {
    String name;
    int age;
    double weight;

    // Constructor
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Common methods
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void breathe() {
        System.out.println(name + " is breathing.");
    }

    // Abstract methods
    public abstract void makeSound();
    public abstract void move();
}
