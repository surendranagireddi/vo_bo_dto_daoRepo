package com.java.bo;

public class StudentBO {

	private int rno;
	private String name;
	private int marks;
	private int total;
	private String result;
	
	public StudentBO() {
		
	}

	public StudentBO(int rno, String name, int marks, int total, String result) {
		super();
		this.rno = rno;
		this.name = name;
		this.marks = marks;
		this.total = total;
		this.result = result;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
}
