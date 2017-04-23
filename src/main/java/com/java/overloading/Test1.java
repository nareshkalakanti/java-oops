package com.java.overloading;

public class Test1 {
    public void m1(String s){
        System.out.println("String Version");
    }
    public void m1(Object o){
        System.out.println("Object version ");
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.m1(new Object());
        t1.m1("naresh");
        t1.m1(null);

    }
}
