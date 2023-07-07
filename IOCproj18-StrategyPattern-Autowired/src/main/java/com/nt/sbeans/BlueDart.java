package com.nt.sbeans;

public final class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid + "order id order is assigned to BlueDart for delivery";
	}

}
