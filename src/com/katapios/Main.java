package com.katapios;

public class Main {

    public static void main(String[] args) {

        //link to Generator interface
        GeneratorInterface interfaceLink = GeneratorClass::instanceSok;
        GeneratorInterface interfaceLink2 = GeneratorClass::instanceSok;
        GeneratorInterface interfaceLink3 = GeneratorClass::instanceSok;

        //class instance
        GeneratorClass classInstance = new GeneratorClass();

        System.out.println(interfaceLink.drinkObjectSoc(classInstance));
        System.out.println(interfaceLink2.drinkObjectSoc(classInstance));
        System.out.println(interfaceLink3.drinkObjectSoc(classInstance));

    }
}
