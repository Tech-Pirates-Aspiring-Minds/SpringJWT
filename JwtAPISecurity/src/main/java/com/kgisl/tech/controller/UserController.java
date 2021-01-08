package com.kgisl.tech.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.tech.model.User;

@RestController
public class UserController {

	@GetMapping("listusers")
	public List<User> getUserList() {

		// Hard coding userList as there is no database integration here 
		User user1 = new User("tina");
		User user2 = new User("sneha");

		List<User> staticUserList = new LinkedList<>();
		staticUserList.add(user1);
		staticUserList.add(user2);

		return staticUserList;

	}
}