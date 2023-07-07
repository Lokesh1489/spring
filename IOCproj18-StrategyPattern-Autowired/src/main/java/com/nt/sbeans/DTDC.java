package com.nt.sbeans;

public final class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC :: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid + "order id order is assigned to DTDC for delivery";
	}
}
