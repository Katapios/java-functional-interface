package com.katapios;

@FunctionalInterface
public interface DoubleElementGenerator {

    Double next(Double current);

}
