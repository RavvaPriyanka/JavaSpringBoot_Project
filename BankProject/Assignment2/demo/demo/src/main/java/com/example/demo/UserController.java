package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	void getUsers()
	{
	System.out.println("called");
	}
	
	@GetMapping("/{id}")
	void getUser(@PathVariable Integer id)
	{
	System.out.println("called  "+id);
	}
	
	@PostMapping
	private String postcall(@RequestBody User user) {//create user or save user
		System.out.println("post_got user: "+ user.getName());
		return "post called";
	}
	//PUT
	
	@PutMapping
	String handlePutMapping() {
		return "put called";
	}
	
	
}
