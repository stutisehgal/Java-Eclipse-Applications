package com.trg.coll;

public class Student {
	private int studentId;
	private String name;
	private float marks;
	
	// constructor typically used to initialize the data
	public Student(int studentId, String name, float marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentId != other.studentId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudentId="+ studentId + ", name= " + name + ",marks=" + marks;
	}
	
	//toString method helps display when the class object is called.
	
	public boolean isPass() {
		if(marks>45)
			return true;
		else 
			return false;
	}

}
