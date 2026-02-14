package com.codewithharry.shape;

/*
   You have to create a package named com.codewithharry.shape
   This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
   These classes should use inheritance to properly manage the code!
   Include methods like volume, surface area and getters/setters for dimensions
*/

class Shape {
    public double surfaceArea() {
        return 0;
    }

    public double volume() {
        return 0;
    }
}

// Rectangle Class
class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    // Setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double surfaceArea() {
        return length * breadth;
    }
}

// Square Class (inherits Rectangle)
class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }
}

// Circle Class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return Math.PI * radius * radius;
    }
}

// Cylinder Class (inherits Circle)
class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Getter
    public double getHeight() {
        return height;
    }

    // Setter
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        double r = getRadius();
        return 2 * Math.PI * r * (r + height);
    }

    @Override
    public double volume() {
        double r = getRadius();
        return Math.PI * r * r * height;
    }
}

// Sphere Class (inherits Circle)
class Sphere extends Circle {

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double surfaceArea() {
        double r = getRadius();
        return 4 * Math.PI * r * r;
    }

    @Override
    public double volume() {
        double r = getRadius();
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }
}

// Main Class
public class CWH_Example_5 {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + rect.surfaceArea());

        Square square = new Square(4);
        System.out.println("Square Area: " + square.surfaceArea());

        Circle circle = new Circle(7);
        System.out.println("Circle Area: " + circle.surfaceArea());

        Cylinder cylinder = new Cylinder(3, 5);
        System.out.println("Cylinder Surface Area: " + cylinder.surfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        Sphere sphere = new Sphere(6);
        System.out.println("Sphere Surface Area: " + sphere.surfaceArea());
        System.out.println("Sphere Volume: " + sphere.volume());
    }
}
