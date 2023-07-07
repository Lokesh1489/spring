package com.nc.beans;

public class StuMark {
	private Marks marks;
	private Student student;

	public StuMark() {

	}

	public StuMark(Marks marks, Student student) {
		this.marks = marks;
		this.student = student;
	}

	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String report() {
		return "Hi " + (this.student.getName()) + ", Your total marks is "
				+ (this.marks.getMath() + this.marks.getSci() + this.marks.getSoc()) + ", Congrats!!!";
	}

}
