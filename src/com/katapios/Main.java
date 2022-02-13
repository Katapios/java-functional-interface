package com.katapios;

public class Main {

    public static void main(String[] args) {

        //making an instance
        MakeMySocClass instSoc = new MakeMySocClass();

        //link to interface - instance version
        MakeSocInterface mySoc = instSoc::instanceSoc;

        String socClass = mySoc.drink();
        String socClass2 = mySoc.drink();
        String socClass3 = mySoc.drink();
        System.out.println(socClass);
        System.out.println(socClass2);
        System.out.println(socClass3);

        System.out.println("");

        //link to interface - static version
        MakeSocInterface statSoc = MakeMySocClass::staticSoc;

        String myStatSoc = statSoc.drink();
        String myStatSoc2 = statSoc.drink();
        String myStatSoc3 = statSoc.drink();
        System.out.println(myStatSoc);
        System.out.println(myStatSoc2);
        System.out.println(myStatSoc3);

    }
}
