package com.learning.version.java8.functionalinterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorFI {

	public static void main(String[] args) {
		UnaryOperator<Integer> increment = x -> x + 1;

        int result1 = increment.apply(5); // returns 6
        System.out.println("Incremented value: " + result1);

	}

}
/*
Processing streams of data: When working with streams of data, you might need to apply a transformation function to each element 
of the stream. The UnaryOperator interface can be used to define the transformation function that takes an input element and returns 
the transformed element. For example, you might want to convert all strings in a list to uppercase using a UnaryOperator<String> function.

Incrementing or decrementing values: When you need to perform a simple arithmetic operation such as incrementing or decrementing 
an integer value, you can use a UnaryOperator<Integer> function to define the operation. This can be useful in scenarios such as 
calculating the age of a person based on their birth year.
 */