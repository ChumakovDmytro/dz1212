package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(1, 1);
        System.out.println(circle.Area());
        System.out.println(rectangle.Perimeter());
    }
}
