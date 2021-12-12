package com.company;

public class Rectangle extends Figure {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    float Area() {
        return this.a*this.b;
    }

    @Override
    public float Perimetr() {
        return (this.a+this.b)*2;
    }

    @Override
    public float Perimeter() {
        return (this.a+this.b)*2;
    }
}
