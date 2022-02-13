package com.katapios;

@FunctionalInterface
public interface StringElementGenerator {

    String next(String current);

}
