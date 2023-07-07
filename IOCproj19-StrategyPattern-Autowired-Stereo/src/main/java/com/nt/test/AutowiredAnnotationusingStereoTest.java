package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class AutowiredAnnotationusingStereoTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
		Flipkart flipkart = ctx.getBean("fpkt", Flipkart.class);
		String msg = flipkart.Shopping(new String[] { "shirt", "trouser", "belt" },new double[] { 1000.0, 2000.0, 3000.0 });
		System.out.println(msg);
	}

}
