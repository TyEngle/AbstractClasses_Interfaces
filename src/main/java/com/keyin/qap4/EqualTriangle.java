package com.keyin.qap4;

public class EqualTriangle extends Shape{
    //instance var sideA, sideB, sideC
    //parameter constructor
    //accessor and modifier(get set)
    //output method(toString)
    private int sideA, sideB, sideC;


    public EqualTriangle(String newName, int newSideLength) {
        super(newName);
        this.sideA = newSideLength;
        this.sideB = newSideLength;
        this.sideC = newSideLength;

    }




    //get and set for instance variables
    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    //get method for finding perimeter and area
    @Override
    public double getPerimeter(){
        return sideA + sideB + sideC;
    }
    @Override
    public double getArea(){
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }

    @Override
    public void scale(int scalingFactor) {
        //sideA, sideB, sideC
        this.sideA *= scalingFactor;
        this.sideB *= scalingFactor;
        this.sideC *= scalingFactor;
    }

    @Override
    public String toString(){
        return "Equilateral triangle obj with name of "+ getName()
                + "\nand sides of A: "+getSideA()
                + ", B: "+getSideB()+ ", C: "+getSideC()
                + "\nhas an area of "+ getArea()
                + "\nand a perimeter of "+ getPerimeter();
    }

}
