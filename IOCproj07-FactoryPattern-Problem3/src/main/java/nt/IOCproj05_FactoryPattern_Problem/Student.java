package nt.IOCproj05_FactoryPattern_Problem;

public class Student extends Person {
	private String course;
	private int rollno;

	public Student(String name, String addrs, AadharDetails aadhar, String course, int rollno) {
		super(name, addrs, aadhar);
		System.out.println("Employee::5-param constructor");
		this.course = course;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", rollno=" + rollno + "]";
	}

}
