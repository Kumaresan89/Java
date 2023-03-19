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

/*
The printName Consumer prints out each user's name by calling the getName() method on the user object. 
We use the forEach method to apply the printName Consumer to each user in the users list.

Realtime example
Suppose you are building an application that needs to print a list of messages to a console. 
You could use a Consumer to print each message in the list:
List<String> messages = // some list of messages

Consumer<String> printMessage = message -> System.out.println(message);

messages.forEach(printMessage);


*/