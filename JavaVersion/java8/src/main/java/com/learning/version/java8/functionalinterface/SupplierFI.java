package com.learning.version.java8.functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFI {

	public static void main(String[] args) {
		Supplier<Integer> randomNumberSupplier = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };

        int randomNumber = randomNumberSupplier.get();
        System.out.println("Random number generated: " + randomNumber);

	}

}
/*
Generating unique IDs: When you need to generate unique IDs for objects, you can use a Supplier function to define the ID generation logic.
 For example, you might create a Supplier<String> function that generates a unique alphanumeric ID based on a certain pattern.

Providing default values: When working with objects that might not have a default value, you can use a Supplier function to provide
 a default value. For example, you might create a Supplier<String> function that returns a default message when an error occurs.

Lazily initializing objects: When you have an expensive or time-consuming object initialization process, you can use a Supplier function 
to lazily initialize the object only when it is needed. For example, you might create a Supplier<DatabaseConnection> function that 
initializes a database connection only when the connection is actually needed.

Memoization: Memoization is a technique that involves caching the results of expensive function calls and reusing them when the same 
inputs are provided again. You can use a Supplier function to define the logic for caching and returning the results of expensive 
function calls.
*/