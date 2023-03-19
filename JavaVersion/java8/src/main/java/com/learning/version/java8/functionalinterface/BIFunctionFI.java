package com.learning.version.java8.functionalinterface;

import java.util.function.BiFunction;

public class BIFunctionFI {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

		int result = sum.apply(10, 20); // returns 30
		System.out.println("Sum of two integers: " + result);

	}

}

/*
 * Realtime example Suppose you are building an e-commerce application and you
 * need to calculate the total price of a product after applying a discount. You
 * could use a BiFunction to calculate the total price:
 * 
 * Product product = // some product object double discount = 0.1; // 10%
 * discount
 * 
 * BiFunction<Product, Double, Double> totalPrice = (prod, disc) ->
 * prod.getPrice() * (1 - disc);
 * 
 * double priceWithDiscount = totalPrice.apply(product, discount); // returns
 * the total price after discount
 * 
 */