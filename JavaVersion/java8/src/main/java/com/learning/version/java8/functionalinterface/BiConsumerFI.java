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
