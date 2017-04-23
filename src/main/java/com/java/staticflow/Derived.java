package com.java.staticflow;

public class Derived extends Base{
    static int x = 100;
    static {
        m2();
        System.out.println("Derived from first static block");
    }

    public static void main(String[] args) {
        m2();
        System.out.println("Derived from main");
    }

    public static void m2(){
        System.out.println(y);
    }
    static {
        System.out.println("Derived Second static block");
    }
    static int y = 200;
}
