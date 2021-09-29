package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
@RestController
public class AccountController {
	
	@GetMapping("/")
	void getUserAccount()
	{
	System.out.println("called");
	}

	@PostMapping
	private String postcall(@RequestBody Account account) {//create user or save user
		System.out.println("Bank Holdername : "+ account.getName());
		System.out.println("Bank AccountNo : "+ account.getAccno());
		System.out.println("Bank Balance : "+ account.getBalance());
		return "post called";
	}
	
}
