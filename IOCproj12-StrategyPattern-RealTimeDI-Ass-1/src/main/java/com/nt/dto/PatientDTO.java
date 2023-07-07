package com.nt.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable {
	private int pno;
	private String pname;
	private String padd;
	private double perdaycharge;
	private double noofdays;

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPadd() {
		return padd;
	}

	public void setPadd(String padd) {
		this.padd = padd;
	}

	public double getPerdaycharge() {
		return perdaycharge;
	}

	public void setPerdaycharge(double perdaycharge) {
		this.perdaycharge = perdaycharge;
	}

	public double getNoofdays() {
		return noofdays;
	}

	public void setNoofdays(double noofdays) {
		this.noofdays = noofdays;
	}

	@Override
	public String toString() {
		return "PatientDTO [pno=" + pno + ", pname=" + pname + ", padd=" + padd + ", perdaycharge=" + perdaycharge
				+ ", noofdays=" + noofdays + "]";
	}

}
