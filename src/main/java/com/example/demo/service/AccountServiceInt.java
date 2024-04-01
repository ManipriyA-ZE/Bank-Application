package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Account;

public interface AccountServiceInt {
	public Account saveAccount(Account  account);
	public List<Account> getAllAccounts();
	public Account getById(int id);
	public Account deposit(int id,long amount);
	public Account withdraw(int id,long amount);

}
