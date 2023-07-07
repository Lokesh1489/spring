package com.nt.test;

import com.nt.factory.PersonFactory;

import nt.IOCproj05_FactoryPattern_Problem.Customer;
import nt.IOCproj05_FactoryPattern_Problem.Employee;
import nt.IOCproj05_FactoryPattern_Problem.Person;

public class FactoryPatternSolutionTest {

	public static void main(String[] args) throws Exception {
		Person emp = PersonFactory.getPerson(Employee.class);
		System.out.println(emp);
		System.out.println("===============");
		Person cust = PersonFactory.getPerson(Customer.class);
		System.out.println(cust);
	}

}
