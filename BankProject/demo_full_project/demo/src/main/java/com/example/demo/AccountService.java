package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	@Autowired
	AccountRepository repository;
	public void save(Account account) {
		repository.save(account);
		System.out.println(account);
			
	}
	public List<Account> getUserAccounts() {
		return repository.findAll();
		
	}

}

