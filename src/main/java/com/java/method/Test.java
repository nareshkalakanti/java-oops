package com.java.method;

public class Test {

    public void m1(int i)
    {
        System.out.println(i);
    }
    public void m2(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1(10);
        t.m2("Naresh");
        //t.m3(10.5)// CE
    }

}
