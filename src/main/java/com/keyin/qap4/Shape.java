package com.keyin.qap4;

public abstract class Shape implements Scalable{
    //instance var name
    //parameter constructor
    //accessor and modifier(get set)
    //output method(toString)
    private String name;

    public Shape(String newName) {
        this.name = newName;
    }

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    };

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();

    public abstract void scale(int scalingFactor);
}
