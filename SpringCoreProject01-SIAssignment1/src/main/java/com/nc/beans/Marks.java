package com.nc.beans;

public class Marks {
	private int math, sci, soc;

	public Marks() {

	}

	public Marks(int math, int sci, int soc) {
		this.math = math;
		this.sci = sci;
		this.soc = soc;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getSoc() {
		return soc;
	}

	public void setSoc(int soc) {
		this.soc = soc;
	}
}
