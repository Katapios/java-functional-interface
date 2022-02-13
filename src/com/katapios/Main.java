package com.katapios;

public class Main {

    public static void main(String[] args) {
        GenericClass genericClass = new GenericClass();

        IntElementGenerator nextIntElement = genericClass::nextElement;
        DoubleElementGenerator nextDoubleElement = genericClass::nextElement;
        StringElementGenerator nextStringElement = genericClass::nextElement;

        //IntElementGenerator nextElementInt = genericClass::<Integer>nextElement;

        System.out.println(nextIntElement.next(12));
        System.out.println(nextDoubleElement.next(12.0));
        System.out.println(nextStringElement.next("12"));
    }
}
