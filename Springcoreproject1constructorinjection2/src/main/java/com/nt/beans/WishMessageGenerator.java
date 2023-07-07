package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	// Has-A property
	public WishMessageGenerator(Date date) {
		this.date=date;
		System.out.println("WishMessageGenerator,1-param constructor");
		System.out.println(this.hashCode() +" "+date.hashCode());
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
