package com.nt.factory;

import java.lang.reflect.Constructor;

import nt.IOCproj05_FactoryPattern_Problem.AadharDetails;
import nt.IOCproj05_FactoryPattern_Problem.Customer;
import nt.IOCproj05_FactoryPattern_Problem.Employee;
import nt.IOCproj05_FactoryPattern_Problem.Person;
import nt.IOCproj05_FactoryPattern_Problem.Student;

public class PersonFactory {

	public static <T extends Person> T getPerson(Class<T> clazz) throws Exception {
		Constructor<?>[] cons = clazz.getDeclaredConstructors();
		Object obj = null;

		if (clazz == Employee.class) {
			AadharDetails details = new AadharDetails(12345L, 20, 94545l);
			obj = cons[0].newInstance("loki", "bangalore", details, "Softtek", 56799.0);
		} else if (clazz == Customer.class) {
			AadharDetails details = new AadharDetails(123456L, 21, 9444545l);
			obj = cons[0].newInstance("Ashik", "mysore", details, 1234, 66799.0);
		} else if (clazz == Student.class) {
			AadharDetails details = new AadharDetails(1234567L, 22, 9454555l);
			obj = cons[0].newInstance("nandish", "bangalore", details, "Softtek", 76799.0);
		} else {
			throw new IllegalArgumentException("Invaild Person Type");
		}
		return (T) obj;
	}
}
