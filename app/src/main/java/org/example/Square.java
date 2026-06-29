package org.example;

public class Square extends Rectangle {
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    public double getSideLength() {
        return getLength();
    }
}
