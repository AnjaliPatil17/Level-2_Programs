package com.BridegLabez.level2;

public class AreaMethodOverloading {
    public int area(int side){
        System.out.print("Area of Square: ");
        return 2*side;
    }
    public double area(double radius){
        System.out.println("Area of Square: ");
        return 3.14*radius*radius;
    }
    public int area(int length,int breadth){
        System.out.println("Area of rectangle: ");
        return length*breadth;
    }
    public static void main(String[] args) {
        AreaMethodOverloading area1=new AreaMethodOverloading();
        System.out.println(area1.area(4));
        System.out.println(area1.area(5,6));
        System.out.println(area1.area(8));
    }
}
