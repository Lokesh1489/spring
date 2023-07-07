package com.nt.vo;

public class PatientVO {
	private String pno;
	private String pname;
	private String padd;
	private String perdaycharge;
	private String noofdays;

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
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

	public String getPerdaycharge() {
		return perdaycharge;
	}

	public void setPerdaycharge(String perdaycharge) {
		this.perdaycharge = perdaycharge;
	}

	public String getNoofdays() {
		return noofdays;
	}

	public void setNoofdays(String noofdays) {
		this.noofdays = noofdays;
	}

	@Override
	public String toString() {
		return "PatientVO [pno=" + pno + ", pname=" + pname + ", padd=" + padd + ", perdaycharge=" + perdaycharge
				+ ", noofdays=" + noofdays + "]";
	}

}
