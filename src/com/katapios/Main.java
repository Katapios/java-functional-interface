package com.katapios;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //link to Date class constructor
        GeneratorInterface generatorInterface = Date::new;

        //create new instance of Date class
        Object newObject = generatorInterface.createNewObject();

        //print date
        System.out.println(newObject);

        //print class name
        System.out.println("\nclass name is: " + "'" + newObject.getClass() + "'");
    }
}
