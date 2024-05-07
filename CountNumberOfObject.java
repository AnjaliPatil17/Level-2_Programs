package com.BridegLabez.level2;

public class CountNumberOfObject {
    int counter=0;
    public CountNumberOfObject(){
        this.counter=counter;
    }

    public int countObject(){
        counter++;
        return counter;
    }
    public static void main(String[] args) {
        CountNumberOfObject obj=new CountNumberOfObject();
        obj.countObject();
        System.out.println("The count of object call is "+ obj.countObject());
    }
}
