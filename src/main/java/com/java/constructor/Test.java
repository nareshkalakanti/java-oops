package com.java.constructor;

//WAP to print no of objects in a class
public class Test {
    static int count = 0;
    //creating a Instance block
    {
        count++;
    }

    Test(){

    }
    Test (int i){

    }
    Test(double d){

    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(10);
        Test t3 = new Test(10.5);
        System.out.println("The no of objects created :" +count);
    }
}
