package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
@RestController
public class AccountController {
	
	@GetMapping
	ArrayList<Account> getUserAccounts()
	{
	System.out.println("account get method called");
	System.out.println(accountList);
	return accountList;
	}
	
	

	@GetMapping("/{id}")
	void getUserAccount(@PathVariable Integer id)
	{
	System.out.println("called  "+id);
	}	

	ArrayList<Account> accountList=new ArrayList<Account>();
	@PostMapping
	private String postcall(@RequestBody Account account) {//create user or save user
		System.out.println("Bank Holdername : "+ account.getName());
		System.out.println("Bank AccountNo : "+ account.getAccno());
		System.out.println("Bank AccountType : "+ account.getAcc_type());
		System.out.println("Bank Balance : "+ account.getBalance());
		accountList.add(account);
		return "post called";
	}
	
}
