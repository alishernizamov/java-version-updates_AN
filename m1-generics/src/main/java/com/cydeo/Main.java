package com.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ArrayList items = new ArrayList(); //ArrayList is able to accept anything and any data type
        ArrayList<Integer> items = new ArrayList<Integer>(); //ArrayList can only accept objects that belong to Integer class

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("Apple");

        printDouble(items);


    }

    private static void printDouble(ArrayList<Integer> items) {
        for (Integer i : items){
            System.out.println(i*2);
        }
    }
}
