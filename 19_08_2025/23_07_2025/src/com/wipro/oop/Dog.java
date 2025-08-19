package com.wipro.oop;

public class Dog extends Animal {

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
	public
    void makeSound() {
        System.out.println(name + " barks: Woof woof!");
    }

    @Override
	public
    void move() {
        System.out.println(name + " runs on four legs.");
    }
}


