package com.example.Authentication;


import com.example.Authentication.entities.User;
import com.example.Authentication.repositories.UserRepository;
import com.example.Authentication.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EntityTests {
	
	static User user;
	
	@BeforeAll
	static void init() {
		user = new User("test", "test@gmail.com", "test");
	}
	
	@Test
	void testGetId() {
		assertEquals(user.getId(), null);
	}
	
	@Test
	 void testGetUserName() {
		assertEquals(user.getUserName(),"test");
	}
	
	@Test
	void testGetEmail() {
		assertEquals(user.getEmail(),"test@gmail.com");
	}
	
	@Test
	void testGetPassword() {
		assertEquals(user.getPassword(), "test");
	}
}
