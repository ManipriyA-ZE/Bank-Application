package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.repo.AccountRepo;

@Service
public class AccountServImpl  implements AccountServiceInt{
	@Autowired
	AccountRepo accountRepo;
	

	@Override
	public Account saveAccount(Account account) {
		
		
		return accountRepo.save(account);
	}

	@Override
	public List<Account> getAllAccounts() {
		
		return accountRepo.findAll();
	}

	@Override
	public Account getById(int id) {
		Optional<Account> optional = accountRepo.findById(id);
		if(optional.isPresent()) {
			return  optional.get();
			
		}
	
		return null;
	}

	@Override
	public Account deposit(int id,long amount) {
		Optional<Account> optional = accountRepo.findById(id);
		Account account=new Account();
		
		if(optional.isPresent()) {
			 Account account2 = optional.get();
			 long balance = account2.getaBalance()+amount;
			
			 account2.setaBalance(balance);
			 Account save = accountRepo.save(account2);
			 return save;
			 
		}
	
	
		return null;
	}

	@Override
	public Account withdraw(int id, long amount) {
		// TODO Auto-generated method stub
		Optional<Account> optional = accountRepo.findById(id);
		Account account=new Account();
		
		if(optional.isPresent()) {
			 Account account2 = optional.get();
			 long balance = account2.getaBalance()-amount;
			
			 account2.setaBalance(balance);
			 Account save = accountRepo.save(account2);
			 return save;
			 
		}
	
		return null;
	}

}
