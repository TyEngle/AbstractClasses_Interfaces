package com.keyin.qap4;

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
//        shapes.forEach((shape) -> print(shape));



        ArrayList<Scalable> scaleList = new ArrayList<>();
        scaleList.add(weirdEObject);
        scaleList.add(equalEllipse);
        scaleList.add(triSidesEqual);
        scaleList.add(triSidesDifferent);


        myMethod(scaleList, 3);


    }
    public static void print(Shape shape){
    //method to help print values with forEach loop
        System.out.println(shape);
        System.out.println("");
    }
    public static void myMethod(ArrayList<Scalable> scaleList, int scaleFactor){
        for (int i=0;i<scaleList.size();i++){
            //before scale print statement
            System.out.println("Object before scaling:");
            System.out.println(scaleList.get(i));
            System.out.println("");
            Scalable scaledShape = scaleList.get(i);

            scaledShape.scale(scaleFactor);
            //after scale print statement
            System.out.println("Object after scaling:");
            System.out.println(scaledShape);
            System.out.println("");
            System.out.println("");

        }



    }

    ;
}




