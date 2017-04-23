package com.java.encapsulation;

// Customer checks Balance and Update Balance

public class Account {

    //Data hiding
    private double balance;

    //Abstraction

    //Balance Enquiry
    public double getBalance(){
        //validation
        return balance;
    }

    //Update Balance

    public void setBalance(double balance){
        //validation
        this.balance = balance;
    }

}
