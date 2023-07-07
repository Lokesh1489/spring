package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public String Shopping(String Items[], double Prices[]) {
		double billAmt = 0.0;
		for (double p : Prices) {
			billAmt += p;
		}
		int oid = new Random().nextInt(10000);

		String msg = courier.deliver(oid);
		return Arrays.toString(Items) + "are purchased having billamount" + billAmt + "----->" + msg;

	}
}
