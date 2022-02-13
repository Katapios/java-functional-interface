package com.katapios;

@FunctionalInterface
public interface IntElementGenerator {

    Integer next(Integer current);

}
