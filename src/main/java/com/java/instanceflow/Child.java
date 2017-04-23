package com.java.instanceflow;

public class Child extends Parent {
    int x = 100;
    {
        m2();
        System.out.println("Child first Instance Block");
    }
    Child(){
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Child Main");
    }
    public void m2()
    {
        System.out.println(y);
    }
    {
        System.out.println("Child Second Instance Block");
    }
    int y =200;

}
