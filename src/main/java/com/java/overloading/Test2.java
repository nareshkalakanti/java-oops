package com.java.overloading;

public class Test2 {
    public void m1(String s){
        System.out.println("String Version");
    }

    public void m1(StringBuffer sb){
        System.out.println("String Buffer version");
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.m1("naresh");
        t2.m1(new StringBuffer("naresh"));
       // t2.m1(null);
    }
}
