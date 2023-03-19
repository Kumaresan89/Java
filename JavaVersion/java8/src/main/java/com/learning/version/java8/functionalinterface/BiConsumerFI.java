package com.learning.version.java8.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;

import com.learning.version.java8.pojo.User;

public class BiConsumerFI {

	public static void main(String[] args) {
		List<User> users = new User().getUsers();
		// Print each user's name and age
        BiConsumer<User, Integer> printNameAndAge = (user, index) -> {
            System.out.println("User #" + index + ": " + user.getName() + " (age " + user.getAge() + ")");
        };
        for (int i = 0; i < users.size(); i++) {
            printNameAndAge.accept(users.get(i), i + 1);
        }
	}

}

/*
The printNameAndAge BiConsumer prints out each user's name and age by calling the getName() and getAge() methods on the user object, 
respectively. We also pass in an index parameter to keep track of the user's position in the list. 
We use a for loop to apply the printNameAndAge BiConsumer to each user in the users list, passing in the user object and its index.
*/
