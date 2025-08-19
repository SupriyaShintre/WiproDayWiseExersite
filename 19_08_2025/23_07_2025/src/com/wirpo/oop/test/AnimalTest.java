package com.wirpo.oop.test;

import com.wipro.oop.Animal;
import com.wipro.oop.Human;
import com.wipro.oop.Dog;
import com.wipro.oop.Bird;
public class AnimalTest {
    public static void main(String[] args) {
        Animal human = new Human("Alice", 25, 55.5);
        Animal dog = new Dog("Buddy", 4, 18.2);
        Animal bird = new Bird("Tweety", 1, 0.5);

        human.eat();
        human.makeSound();
        human.move();

        System.out.println();

        dog.sleep();
        dog.makeSound();
        dog.move();

        System.out.println();

        bird.breathe();
        bird.makeSound();
        bird.move();
    }
}


