package com.halal.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function takes 1 arg and produces 1 result
        int increment = incrementByOne(2);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(2);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(1));

        //BiFunction takes 2 arg and produces 1 result
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyByFunction.apply(4, 100));
    }


    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int incrementByOne(int number) {
        return ++number;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByFunction =
            (numberToIncrementBy1, numberToMultiplyBy) -> (numberToIncrementBy1 + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiply) {
        return (++number) * numToMultiply;
    }
}
