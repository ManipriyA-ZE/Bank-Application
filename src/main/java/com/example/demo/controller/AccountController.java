package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountServiceInt;

@RestController
public class AccountController {
	@Autowired
	AccountServiceInt accountServiceInt;
	@PostMapping ("saveAccount")
	public ResponseEntity<Account> createAccount(@RequestBody Account account){
		return new ResponseEntity<>(accountServiceInt.saveAccount(account),HttpStatus.CREATED);
		
	} 
	@GetMapping("getAllAccounts")
	public ResponseEntity<List<Account>> getAllAccounts(){
		return new ResponseEntity<>(accountServiceInt.getAllAccounts(),HttpStatus.OK);
	}
	@GetMapping("getById/{id}")
	public ResponseEntity<Account> getAccountById(@PathVariable int id){
		return new ResponseEntity<Account>(accountServiceInt.getById(id),HttpStatus.OK);
		
	}
	@PutMapping("deposit/{id}")
	public ResponseEntity<Account> deposit(@PathVariable int id,@RequestBody  Map<String,Long> map){
		
		return new ResponseEntity<>(accountServiceInt.deposit(id,map.get("amount")),HttpStatus.OK);
	}
	@PutMapping("withdraw/{id}")
	public ResponseEntity<Account> withdraw(@PathVariable int id,@RequestBody  Map<String,Long> map){
		return new ResponseEntity<>(accountServiceInt.withdraw(id, map.get("amount")),HttpStatus.OK);
	}   
	
	

}
