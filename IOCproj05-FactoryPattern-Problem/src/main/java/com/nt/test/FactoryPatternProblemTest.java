package com.nt.test;

import nt.IOCproj05_FactoryPattern_Problem.AadharDetails;
import nt.IOCproj05_FactoryPattern_Problem.Employee;
import nt.IOCproj05_FactoryPattern_Problem.Person;
import nt.IOCproj05_FactoryPattern_Problem.Student;

public class FactoryPatternProblemTest {

	public static void main(String[] args) {
		AadharDetails details = new AadharDetails(12000L, 20, 999999L);
		Person emp = new Employee("lokesh", "Bangalore", details, "Softtek", 6899.0);
		System.out.println(emp);
		System.out.println("=====================");

		AadharDetails details1 = new AadharDetails(12000L, 20, 999999L);
		Person stud = new Student("lok", "Bangalore", details1, "Softtek", 6899);
		System.out.println(stud);
		
	}

}
