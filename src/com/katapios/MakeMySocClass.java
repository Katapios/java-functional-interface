package com.katapios;

public class MakeMySocClass {

    private int instanceIter = 1;
    private static int staticIter = 1;

    //instance
    public String instanceSoc() {
        return "Drink my instance sok " + instanceIter++;
    }

    //static
    public static String staticSoc() {
        return "Drink my static sok " + staticIter++;
    }

}