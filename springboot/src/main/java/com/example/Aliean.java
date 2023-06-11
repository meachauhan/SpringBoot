package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aliean {

	private int aid;
	private String aname;
	@Autowired
	private Laptop laptop;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public void show() {
		System.out.println("In Show");
		laptop.laptopShow();
	}
}
