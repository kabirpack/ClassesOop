package com.constructors;

public class ConstructorMain {

    public static void main(String[] args){

        Account kabAccount = new Account(); //("0224", 0.00, "Syed Kabir", "kabir3rd@gmial.com", "9894513548");
        //checking the constructor is loaded
        System.out.println(kabAccount.getNumber());
        System.out.println(kabAccount.getBalance());

        // deposit & withdrawal
        kabAccount.withdrawal(100.0);
        kabAccount.deposit(50.0);
        kabAccount.withdrawal(100.0);

        Account kabPrivateAccount = new Account( "Syed Kabir", "kabir3rd@gmial.com", "9894513548");
        System.out.println(kabPrivateAccount.getNumber());
        System.out.println(kabPrivateAccount.getBalance());
    }
}
