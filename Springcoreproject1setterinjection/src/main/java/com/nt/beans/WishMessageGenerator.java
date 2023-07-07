package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	// Has-A property
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator,0-param constructor");
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generatemessage()");
		int hour = date.getHours();
		if (hour < 12)
			return "good morning" + user;
		else if (hour < 16)
			return "good afternoon" + user;
		else if (hour < 20)
			return "good evening" + user;
		else
			return "good night" + user;

	}
}
