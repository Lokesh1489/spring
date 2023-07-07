package com.nt.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkartFactory {

	private static Properties props;

	static {
		System.out.println("FlipkartFactory.static.block");
		try {
			InputStream is = new FileInputStream("src/main/java/com/nt/commons/info.properties");
			props = new Properties();
			props.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Flipkart getInatance() throws Exception {
		System.out.println(" FlipkartFactory.getInstance()");

		String courierClassName = props.getProperty("courier.classname");

		Class c = Class.forName(courierClassName);

		Constructor<Courier> cons[] = c.getDeclaredConstructors();
		Courier courier = cons[0].newInstance();
		Flipkart fkpt = new Flipkart();
		fkpt.setCourier(courier);
		return fkpt;
	}

}
