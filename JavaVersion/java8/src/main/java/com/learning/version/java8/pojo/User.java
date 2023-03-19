package com.learning.version.java8.pojo;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
    private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
    public List<User> getUsers(){
    	List<User> users = new ArrayList<User>();
    	User user1 = new User();
    	user1.setName("Alice");
    	user1.setAge(20);
    	users.add(user1);
    	User user2 = new User();
    	user2.setName("Bob");
    	user2.setAge(22);
    	users.add(user2);
    	User user3 = new User();
    	user3.setName("Charlie");
    	user3.setAge(21);
    	users.add(user3);
    	User user4 = new User();
    	user4.setName("Lisa");
    	user4.setAge(19);
    	users.add(user4);
    	User user5 = new User();
    	user5.setName("Ema");
    	user5.setAge(18);
    	users.add(user5);
    	return users;
    }

}
