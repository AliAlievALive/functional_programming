package com.halal.finalsection;

import java.util.function.BiFunction;

public class Lambdas {
    public static void main(String[] args) {

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        String upperCasedName = upperCaseName.apply("Ali", 20);
        System.out.println(upperCasedName);
    }
}
