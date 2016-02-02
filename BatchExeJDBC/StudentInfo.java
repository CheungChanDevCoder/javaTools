package com.cheungchan;

public class StudentInfo {
	private String id;
	private String name;
	private int age;
	private double grade;
	public String getId() {
		return id;
	}
	public StudentInfo(String id, String name, int age, double grade) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
}
