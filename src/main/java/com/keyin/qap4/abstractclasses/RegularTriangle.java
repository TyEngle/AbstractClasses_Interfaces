package com.keyin.qap4.abstractclasses;

public class EqualateralTriangle extends Shape{
    private int sideA, sideB, sideC;
    private double area;
    private double perimeter;

    @Override
    public double getPerimeter(){
        return sideA + sideB + sideC
    }

}
