package com.wirpo.oop.test;

import com.wipro.oop.Circle;
import com.wipro.oop.Rectangle;
import com.wipro.oop.Square;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", "Red", 2);
        Rectangle rectangle = new Rectangle("Rectangle", "Blue", 3);
        Square square = new Square("Square", "Green", 1);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
