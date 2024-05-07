package com.BridegLabez.level2;

import java.util.Scanner;

public class Calculator {
    public static double userInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the input: ");
        double num=sc.nextDouble();
        return num;
    }

    public static double addition(double num1,double num2){
        double result =num1+num2;
        return result;
    }
    public static void main(String[] args) {
      double num1=userInput();
      double num2=userInput();
        System.out.println("Addition of Numbers: "+addition(num1,num2));
    }
}
