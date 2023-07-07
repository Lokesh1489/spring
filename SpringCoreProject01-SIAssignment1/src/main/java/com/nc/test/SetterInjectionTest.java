package com.nc.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nc.beans.ArrayMarks;
import com.nc.beans.Marks;
import com.nc.beans.StuMark;
import com.nc.beans.Student;
import com.nc.beans.StudentCollection;

public class SetterInjectionTest {
	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource("src/main/java/com/nc/config/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);

		// --------------------------------------------------------------------------------------------
		// 1: Primitive type Property Example
		Object object1 = factory.getBean("stu");
		Student student1 = (Student) object1;
		String message1 = student1.greet();
		System.out.println("----------------Ex-1--------------------");
		System.out.println(message1);
		System.out.println("\n----------------Ex-2--------------------");

		// -------------------------------------------------------------------------------------------
		// 2: Reference type Property Example
		Object object2 = factory.getBean("stmr");
		StuMark student2 = (StuMark) object2;
		String message2 = student2.report();
		System.out.println(message2);
		System.out.println("\n----------------Ex-3--------------------");

		// -------------------------------------------------------------------------------------------
		// 3: Array type Property Example
		Object object3 = factory.getBean("armk");
		ArrayMarks student3 = (ArrayMarks) object3;
		String message3 = student3.total("Nandish");
		System.out.println(message3);
		System.out.println("\n----------------Ex-4--------------------");

		// -------------------------------------------------------------------------------------------
		// 4: Collection type Property Example
		Object object4 = factory.getBean("stco");
		StudentCollection student4 = (StudentCollection) object4;
		System.out.println("Student List: " + student4.getStudentList());
		System.out.println("Student Set: " + student4.getStudentSet());
		System.out.println("Student Map: " + student4.getStudentMap());
		System.out.println("\n-------------------X--------------------");
	}
}
