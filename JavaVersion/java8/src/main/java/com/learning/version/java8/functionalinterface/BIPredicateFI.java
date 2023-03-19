package com.learning.version.java8.functionalinterface;

import java.util.function.BiPredicate;

public class BIPredicateFI {

	public static void main(String[] args) {
		BiPredicate<String, String> isEqual = (s1, s2) -> s1.equals(s2);

		String str1 = "hello";
		String str2 = "world";

		if (isEqual.test(str1, str2)) {
			System.out.println("The strings are equal.");
		} else {
			System.out.println("The strings are not equal.");
		}

	}

}

/*
Realtime example
Suppose you are building a social media platform and you want to check whether two users are friends. 
You could use a BiPredicate to test whether two user objects are friends and return a boolean value indicating the result:

User user1 = // some user object
User user2 = // some other user object

BiPredicate<User, User> areFriends = (u1, u2) -> u1.getFriends().contains(u2) && u2.getFriends().contains(u1);

if (areFriends.test(user1, user2)) {
    System.out.println("These two users are friends.");
} else {
    System.out.println("These two users are not friends.");
}

*/