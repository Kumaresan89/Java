package com.learning.version.java8.functionalinterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorFI {

	public static void main(String[] args) {
		BinaryOperator<Integer> max = (x, y) -> x > y ? x : y;

        int result2 = max.apply(10, 20); // returns 20
        System.out.println("Maximum value: " + result2);

	}

}
/*
Finding the maximum or minimum value: When you need to find the maximum or minimum value in a list or an array, 
you can use a BinaryOperator<T> function to define the comparison logic. 
For example, you might want to find the oldest person in a list based on their birth year using a BinaryOperator<Person> function.

Combining two values: When you need to combine two values of the same type, such as adding two integers or concatenating two strings, 
you can use a BinaryOperator<T> function to define the operation. 
This can be useful in scenarios such as merging two lists of data or appending two strings together.
*/