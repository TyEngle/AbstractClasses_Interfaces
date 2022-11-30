package com.keyin.qap4;

public class Circle extends Shape{
    //instance var majorAxisA, minorAxisB
    //parameter constructor
    //accessor and modifier(get set)
    //output method(toString)
    private int majorAxisA;
    private int minorAxisB;



    public Circle(String newName, int newMajorAxis, int newMinorAxis){
        //circle is form of ellipse
        //minor and major values must be same
        super(newName);
        this.minorAxisB = newMinorAxis;
        this.majorAxisA = newMajorAxis;

    }

    @Override
    public void setName(String newName) {
        super.setName(newName);
    }
    @Override
    public String getName() {
        return super.getName();
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
        return "Circle obj by name of "+ getName()
                + "\nwith area of "+ getArea()
                + " \nnd circumference of "+ getPerimeter();
    }


}
