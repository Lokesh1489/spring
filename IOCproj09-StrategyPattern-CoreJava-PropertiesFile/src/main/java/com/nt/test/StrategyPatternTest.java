package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyPatternTest {
	public static void main(String[] args) throws Exception  {
		Flipkart fpkt = FlipkartFactory.getInatance();
		String resultMsg = fpkt.Shopping(new String[] { "candles", "flowers", "cake", "wine" },
				new double[] { 4600.0, 2700.0, 370.0, 4700.0 });

		System.out.println(resultMsg);
	}

}
