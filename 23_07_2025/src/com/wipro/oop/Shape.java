package com.wipro.oop;

public class Shape {
    private String name;
    private String color;
    private int borderThickness;

    // Constructor
    public Shape(String name, String color, int borderThickness) {
        this.name = name;
        this.color = color;
        this.borderThickness = borderThickness;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getBorderThickness() {
        return borderThickness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBorderThickness(int borderThickness) {
        this.borderThickness = borderThickness;
    }

    // toString Method
    @Override
    public String toString() {
        return "Shape Name: " + name + ", Color: " + color + ", Border Thickness: " + borderThickness;
    }
}

