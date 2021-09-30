package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	UserService userService;
	@GetMapping("/")
	List<User> getUsers()
	{
	
	System.out.println("called");
	return userService.getUsers();	
	}
	
	@GetMapping("/{id}")
	void getUser(@PathVariable Integer id)
	{
	System.out.println("called  "+id);
	}
	
	@PostMapping
	private String saveUser(@RequestBody User user) {//create user or save user
		userService.save(user);
		
		System.out.println("post_got user: "+ user.getName());
		System.out.println("post_got user: "+ user.getAge());
		return "post called";
	}
	//PUT
	
	@PutMapping
	String handlePutMapping() {
		return "put called";
	}
	
	
}
