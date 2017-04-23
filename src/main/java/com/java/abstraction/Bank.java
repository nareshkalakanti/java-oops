package com.java.abstraction;

public class Bank {
    private int accno ;
    private String customer_name ;
    private double balance;
    private double profit;
    private double loan ;

    public void displayToClerk(){
        System.out.printf("Account no" + accno);
        System.out.println("Coustomer name " + customer_name);
        System.out.println("Account Balance" + balance);
    }

}
