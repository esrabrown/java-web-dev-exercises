package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
       // Double areaOfCircle = Math.PI * radius * radius;
        Double areaOfCircle = Circle.getArea(radius);
        System.out.println("The area of circle of radius "+radius +" is : "+areaOfCircle);


  }
}