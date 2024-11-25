package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void printShape(Shape shape){
        System.out.println(shape.getName());
        System.out.println(shape.area());
    }

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<Shape>();

        for (int i = 0; i < 10; i++) {
            int randomNumber = (int)(Math.random()*3);
            switch (randomNumber){
                case 0:
                    double width = Math.random() * 20;
                    double height = Math.random() * 20;
                    shapes.add( new Rectangle("Rectangle", width, height));
                    break;
                case 1:
                    double radius = Math.random() * 50;
                    shapes.add(new Circle("Circle", radius));
                    break;
                case 2:
                    double side1 = Math.random() * 20;
                    double side2 = Math.random() * 20;
                    double minValue = Math.abs(side1 - side2);
                    double maxValue = side1 + side2-1;
                    double side3 =Math.random() * (maxValue - minValue + 1) + minValue;
                    shapes.add(new Triangle("Triangle", side1, side2, side3));
                    break;
            }
        }

        for(Shape shape:shapes){
            printShape(shape);
        }


    }
}