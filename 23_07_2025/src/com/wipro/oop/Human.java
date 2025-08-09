package com.wipro.oop;

public class Human extends Animal {

    public Human(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
	public
    void makeSound() {
        System.out.println(name + " says: Hello!");
    }

    @Override
	public
    void move() {
        System.out.println(name + " walks on two legs.");
    }
}

