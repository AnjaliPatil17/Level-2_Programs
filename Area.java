package com.BridegLabez.level2;

import java.util.Scanner;

public class Area {

    public int areaOfRectangle(int length,int breadth){
        return length*breadth;
    }

    public double areaOfTriangle(int length,int breadth){
          return 0.5* length *breadth;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first=sc.nextInt();
        System.out.print("Enter the second number: ");
        int second=sc.nextInt();
        Area obj=new Area();
        Area obj1=new Area();
        System.out.println("Area of rectangle is "+obj.areaOfRectangle(first, second));
        System.out.println("Area of Triangle is "+obj1.areaOfTriangle(first,second));
        sc.close();
    }
}
