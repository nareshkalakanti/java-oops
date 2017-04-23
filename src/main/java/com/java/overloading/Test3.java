package com.java.overloading;

public class Test3 {
    public void m1(int i , float f){
        System.out.println("int-float version");
    }
    public void m1(float f , int i ){
        System.out.println("float-int version");
    }

    public static void main(String[] args) {
        Test3 t3 = new Test3();
        t3.m1(10,10.5f);
        t3.m1(10.5f,10);
        //t3.m1(10,10);
        //t3.m1(10.5,10.f);
    }
}
