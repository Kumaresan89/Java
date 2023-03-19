package com.learning.version.java8.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFI {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Filter out odd numbers
        Predicate<Integer> isEven = number -> number % 2 == 0;
//        numbers.removeIf(isEven.negate()); // Remove all elements that do not satisfy the isEven predicate
//        System.out.println(numbers);
        List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenNumbers); 
        // Prints "[2, 4, 6, 8, 10]"

	}

}

/*
Realtime example 
Suppose you are building an e-commerce website and you want to filter all the products that are on sale. 
You could use a Predicate to test whether each product is on sale and return a boolean value indicating 
whether it should be included in the filtered list:

List<Product> products = // some list of products

Predicate<Product> isOnSale = product -> product.isOnSale();

List<Product> filteredProducts = products.stream()
    .filter(isOnSale)
    .collect(Collectors.toList());

*/