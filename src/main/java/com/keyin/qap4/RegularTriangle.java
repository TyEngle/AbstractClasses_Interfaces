package com.keyin.qap4;

public class RegularTriangle extends Shape{
    //instance var sideA, sideB, sideC
    //parameter constructor
    //accessor and modifier(get set)
    //output method(toString)
    private int sideA, sideB, sideC;


    public RegularTriangle(String newName, int newSideA, int newSideB, int newSideC) {
    //constructor to create new regular triangle object
    //name from super class, sideA, sideB, sideC
    // must verify the following:
        //side1+side2>side3
        //side2+side3>side1
        //side3+side1>side2
        super(newName);
        if ((newSideA+newSideB)>newSideC && (newSideA+newSideC)>newSideB && (newSideB+newSideC)>newSideA){
            //continue to create object
            this.sideA = newSideA;
            this.sideB = newSideB;
            this.sideC = newSideC;
        } else{
            //break out and stop program
            System.out.println("Invalid creation of triangle");
            System.exit(406);
        }

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
        //int sideA, sideB, sideC
        this.sideA *= scalingFactor;
        this.sideB *= scalingFactor;
        this.sideC *= scalingFactor;
    }

    @Override
    public String toString(){
        return "Regular triangle obj with name of "+ getName()
                + "\nand sides of A: "+getSideA()
                + ", B: "+getSideB()+ ", C: "+getSideC()
                + "\nwith area of "+ getArea()
                + "\nand a perimeter of "+ getPerimeter();
    }

}
