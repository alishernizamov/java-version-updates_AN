package com.cydeo;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency c = Currency.DIME;
        System.out.println(c); //DIME

        System.out.println(Currency.PENNY);

        System.out.println("How to access all constants");

        Currency[] currencies = Currency.values(); //

        for(Currency currency : currencies){
            System.out.println(currency);
        }

        System.out.println("How to use switch case");

        switch (Currency.PENNY){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cents");
                break;
            case DIME:
                System.out.println("It is 10 cents");
                break;
            case QUARTER:
                System.out.println("It is 25 cents");
                break;
        }

        System.out.println("Operation task");
        calculate(3, 5, Operation.PLUS);

        System.out.println("How to retrieve the constant value");
        System.out.println(Currency.PENNY.getValue()); //this will print the object's value
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.QUARTER.ordinal()); //ordinal() provides index number of constant

    }

    private static void calculate(double x, double y, Operation ooperation){

        switch (ooperation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLE:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;


        }


    }

}
