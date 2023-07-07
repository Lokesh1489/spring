package com.nc.beans;

public class ArrayMarks {
	private String[] ekh = { "", "", "" };
	private int[] sms = { 0, 0, 0 };

	public ArrayMarks() {
	}

	public ArrayMarks(String[] ekh, int[] sms) {
		this.ekh = ekh;
		this.sms = sms;
	}

	public String total(String name) {
		int total = 0;
		for (String s : this.ekh) {
			total = total + Integer.parseInt(s);
		}

		for (int i : this.sms) {
			total = total + i;
		}

		return "Hi " + name + ", Your score is " + total + " of 600, Congrats!!";
	}

}
