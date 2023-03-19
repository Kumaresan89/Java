package com.learning.version.java8.functionalinterface;

import java.util.List;
import java.util.function.Consumer;

import com.learning.version.java8.pojo.User;

public class ConsumerFI {
	public static void main(String[] args) {
		List<User> users = new User().getUsers();
		// Print each user's name
        Consumer<User> printName = user -> System.out.println(user.getName());
        for (int i = 0; i < users.size(); i++) {
        	printName.accept(users.get(i));
        }
	}
}
