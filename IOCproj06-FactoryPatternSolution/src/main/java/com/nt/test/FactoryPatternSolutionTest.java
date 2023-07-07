package com.nt.test;

import com.nt.factory.PersonFactory;

import nt.IOCproj05_FactoryPattern_Problem.Person;

public class FactoryPatternSolutionTest {

	public static void main(String[] args) {
		Person emp = PersonFactory.getPerson("emp");
		System.out.println(emp);
		System.out.println("===============");
		Person cust = PersonFactory.getPerson("cust");
		System.out.println(cust);
	}

}
