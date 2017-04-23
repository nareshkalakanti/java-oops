package com.java.constructor;

public class Student {
    String name;
    int rollno;

    Student(String Name,int Rollno){
        this.name=Name;
        this.rollno=Rollno;
    }

    public static void main(String[] args) {
        Student s = new Student("Naresh",101);
        Student s1 = new Student("Durga",102);

    }



}



