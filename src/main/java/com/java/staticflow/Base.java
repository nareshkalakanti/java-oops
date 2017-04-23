package com.java.staticflow;

public class Base {
    static int i =10;
    static
    {
        m1();
        System.out.println("Base / First Static block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Base Main Method");
    }
    public static void m1(){
        System.out.println(j);
    }
    static
    {
        System.out.println("Base / Second Static block");
    }
    static int j = 20;

}
