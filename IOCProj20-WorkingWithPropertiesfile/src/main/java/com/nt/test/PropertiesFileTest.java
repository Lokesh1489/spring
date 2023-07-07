package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Employee;

public class PropertiesFileTest {
 public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	 Employee emp=ctx.getBean("emp",Employee.class);
	 System.out.println("emp data::"+emp);
	 ctx.close();
}

}
