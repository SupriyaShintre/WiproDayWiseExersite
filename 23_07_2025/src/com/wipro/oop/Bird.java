package com.wipro.oop;

public class Bird extends Animal {

    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
	public
    void makeSound() {
        System.out.println(name + " chirps: Tweet tweet!");
    }

    @Override
	public
    void move() {
        System.out.println(name + " flies in the sky.");
    }
}
