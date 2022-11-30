package com.keyin.qap4;

import com.keyin.qap4.*;

import java.util.ArrayList;

public class Demo {
//create object of each class
//add each object to an array
//loop through each object in the array
//display each objects name, area, perimeter

    public static void main(String[] args) {
        Ellipse weirdEObject = new Ellipse(
                "strange_object", 14, 8);

        Circle equalEllipse = new Circle(
                "no_corners", 12, 12);

        EqualTriangle triSidesEqual = new EqualTriangle(
                "equalateral_triangle", 13);

        RegularTriangle triSidesDifferent = new RegularTriangle(
                "different_sides_triangle", 12, 13, 18);



        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(weirdEObject);
        shapes.add(equalEllipse);
        shapes.add(triSidesEqual);
        shapes.add(triSidesDifferent);
        System.out.println("The created objects are:\n");
        shapes.forEach((shape) -> print(shape));
    }
    public static void print(Shape shape){
    //method to help print values with forEach loop
        System.out.println(shape);
        System.out.println("");
    }

    ;
}




