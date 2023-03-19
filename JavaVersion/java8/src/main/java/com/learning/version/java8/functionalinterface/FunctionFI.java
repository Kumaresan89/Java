package com.learning.version.java8.functionalinterface;

import java.util.function.Function;

public class FunctionFI {

	public static void main(String[] args) {
		Function<String, Integer> strLength = s -> s.length();

		int length = strLength.apply("Hello, world!"); // returns 13
		System.out.println("Length of string: " + length);

	}

}
/*
 * Suppose you are building a weather application that displays the current
 * temperature in both Celsius and Fahrenheit. You could use a Function to
 * convert the temperature from Celsius to Fahrenheit:
 * 
 * Function<Double, Double> celsiusToFahrenheit = celsius -> (celsius * 9 / 5) +
 * 32;
 * 
 * double celsius = 20.0; double fahrenheit =
 * celsiusToFahrenheit.apply(celsius); // returns 68.0
 * 
 */