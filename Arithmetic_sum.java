package com.BridegLabez.level2;

public class Arithmetic_sum {
    public  int add(int a,int b){
        return a+b;
    }
    public  int add(int a,int b,int c){
        return a+b+c;
    }
    public  int add(int a,int b,int c,int d){
        return a+b;
    }

    public static void main(String[] args) {
        Arithmetic_sum obj=new Arithmetic_sum();
        System.out.println("the addition is "+obj.add(9,1));
        System.out.println("the addition is "+obj.add(2,4,6));
        System.out.println("the addition is "+obj.add(4,5,3));
    }
}
