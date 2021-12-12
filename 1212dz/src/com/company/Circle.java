package com.company;

public class Circle extends Figure{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    float Area() {
        return (float) (Math.PI*Math.sqrt(this.r));
    }

    @Override
    public float Perimetr() {
        return (float) (2*Math.PI*r);
    }

    @Override
    public float Perimeter() {
        return (float) (2*Math.PI*this.r);
    }
}
