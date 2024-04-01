package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String aName;
	private long aBalance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public long getaBalance() {
		return aBalance;
	}
	public void setaBalance(long aBalance) {
		this.aBalance = aBalance;
	}
	public Account(int id, String aName, long aBalance) {
		super();
		this.id = id;
		this.aName = aName;
		this.aBalance = aBalance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", aName=" + aName + ", aBalance=" + aBalance + "]";
	}
	
	
	

}
