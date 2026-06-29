package org.example;

public class IsocelesRightTriangle extends RightTriangle {
    public IsocelesRightTriangle(double legLength) {
        super(legLength, legLength);
    }

    public double getLegLength() {
        return getLength();
    }
}
