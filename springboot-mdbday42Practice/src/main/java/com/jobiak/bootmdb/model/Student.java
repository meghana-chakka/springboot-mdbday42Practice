package com.jobiak.bootmdb.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student {
	@Id
	private Long rollNo;
	private String name;
	private String branch;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(Long rollNo, String name, String branch) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
	}
	public Long getRollNo() {
		return rollNo;
	}
	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + "]";
	}
	
}
