package com.cg.sm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private char name;
	private char college;
	private int roll;
	private char qualification;
	private String course;
	private int year;
	private char certificate;
	private String hallticketno;
	
	
	public Student() {
		super();
	}


	public Student(int id, char name, char college, int roll, char qualification, String course, int year,
			char certificate, String hallTicketNo)
	{
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.certificate = certificate;
		this.hallticketno = hallTicketNo;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public char getName() {
		return name;
	}


	public void setName(char name) {
		this.name = name;
	}


	public char getCollege() {
		return college;
	}


	public void setCollege(char college) {
		this.college = college;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public char getQualification() {
		return qualification;
	}


	public void setQualification(char qualification) {
		this.qualification = qualification;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public long getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public char getCertificate() {
		return certificate;
	}


	public void setCertificate(char certificate) {
		this.certificate = certificate;
	}


	public String getHallTicketNo() {
		return hallticketno;
	}


	public void setHallTicketNo(String hallTicketNo) {
		this.hallticketno = hallTicketNo;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", roll=" + roll + ", qualification="
				+ qualification + ", course=" + course + ", year=" + year + ", certificate=" + certificate
				+ ", hallTicketNo=" + hallticketno + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getCollege()=" + getCollege() + ", getRoll()=" + getRoll() + ", getQualification()="
				+ getQualification() + ", getCourse()=" + getCourse() + ", getYear()=" + getYear()
				+ ", getCertificate()=" + getCertificate() + ", getHallTicketNo()=" + getHallTicketNo()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
