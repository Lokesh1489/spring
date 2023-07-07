package com.nt.bo;

public class PatientBO {
	private int pno;
	private String pname;
	private String padd;
	private double perdaycharge;
	private double noofdays;
	private double totalbill;

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

	public double getTotalbill() {
		return totalbill;
	}

	public void setTotalbill(double totalbill) {
		this.totalbill = totalbill;
	}

	@Override
	public String toString() {
		return "PatientBO [pno=" + pno + ", pname=" + pname + ", padd=" + padd + ", perdaycharge=" + perdaycharge
				+ ", noofdays=" + noofdays + ", totalbill=" + totalbill + "]";

	}
}
