package com.katapios;

public class Main {

    public static void main(String[] args) {

        NumberGeneratorClass numberGeneratorClass = new NumberGeneratorClass();

        ModifierInterface<Integer> a = numberGeneratorClass::add;
        ModifierInterface<Double> b = numberGeneratorClass::add;
        ModifierInterface<String> c = numberGeneratorClass::add;

        System.out.println(numberGeneratorClass.add(2));
        System.out.println(numberGeneratorClass.add(2.0));
        System.out.println(numberGeneratorClass.add("2"));

    }
}
