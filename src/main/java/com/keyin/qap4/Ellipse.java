package com.keyin.qap4;

public class Ellipse extends Shape{
    //instance var majorAxisA minorAxisB
    //parameter constructor
    //accessor and modifier(get set)
    //output method(toString)
    private int majorAxisA;
    private int minorAxisB;

    public Ellipse(String newName, int newMajorAxis, int newMinorAxis) {
        //constructor to set a name--from super class, and both axis
    super(newName);
    this.majorAxisA = newMajorAxis;
    this.minorAxisB = newMinorAxis;

    }

    @Override
    public double getArea() {
        double area = 3.14 * majorAxisA * minorAxisB;
        return area;

    }

    @Override
    public double getPerimeter() {
        return (2 * 3.14 * Math.sqrt((majorAxisA * majorAxisA + minorAxisB * minorAxisB) / (2 * 1.0)));
    }

    @Override
    public void scale(int scalingFactor) {
        this.majorAxisA *= scalingFactor;
        this.minorAxisB *= scalingFactor;
    }

    @Override
    public String toString() {
        return "Ellipse obj by name of "+ getName()
                + "\nwith area of "+ getArea()
                + "\nand perimeter of "+ getPerimeter();
    }
}
