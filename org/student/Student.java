package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name: Preetha");
	}
	public void studentDept() {
		System.out.println("Student Dept: ECE");
	}
	public void studentId() {
		System.out.println("Student ID: 4568");
	}

	public static void main(String[] args) {
		Student s1=new Student();
		
		s1.collegeName();
		s1.collegeCode();
		s1.collegeRank();
		s1.deptName();
		s1.studentDept();
		s1.studentName();
		s1.studentId();

	}

}
