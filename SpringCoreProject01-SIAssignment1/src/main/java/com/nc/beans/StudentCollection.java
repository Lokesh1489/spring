package com.nc.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentCollection {
	private List<String> studentList;
	private Set<String> studentSet;
	private Map<Integer, String> studentMap;

	public List<String> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<String> studentList) {
		this.studentList = studentList;
	}

	public Set<String> getStudentSet() {
		return studentSet;
	}

	public void setStudentSet(Set<String> studentSet) {
		this.studentSet = studentSet;
	}

	public Map<Integer, String> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<Integer, String> studentMap) {
		this.studentMap = studentMap;
	}

}
