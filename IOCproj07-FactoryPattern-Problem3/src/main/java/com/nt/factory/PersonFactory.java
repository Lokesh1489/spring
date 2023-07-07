package com.nt.factory;

import nt.IOCproj05_FactoryPattern_Problem.AadharDetails;
import nt.IOCproj05_FactoryPattern_Problem.Employee;
import nt.IOCproj05_FactoryPattern_Problem.Person;

public class PersonFactory {

	public static Person getPerson(String type) {
		Person per= null;
		AadharDetails details=null;
		
		if(type.equalsIgnoreCase("emp")) {
			details= new AadharDetails(1234L,20,12378l);
			per= new Employee("lokesh","bangalore",details,"Softtek",57800.0);
		}
		else if(type.equalsIgnoreCase("cust")) {
			details= new AadharDetails(1234L,20,12378l);
			per= new Employee("nandish","mysore",details,"Softtek",68800.0);
		}
		else if(type.equalsIgnoreCase("stud")) {
			details= new AadharDetails(1234L,20,12378l);
			per= new Employee("ashik","mysore",details,"Softtek",48800.0);
		}
		else { throw new IllegalArgumentException("invaild person type");
	}
		return per;
}}
