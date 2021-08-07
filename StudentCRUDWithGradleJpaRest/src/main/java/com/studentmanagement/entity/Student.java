package com.studentmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "std_info")
public class Student {
	@Id
	@GeneratedValue
	@Column(length = 12)
	private int sid;
	@Column(length = 12)
	private String stdname;
	@Column(length = 12)
	private int stdnumber;
	@Column(length = 12)
	private String city;

	public String getStdname() {
		return stdname;
	}

	public void setstdname(String stdname) {
		this.stdname = stdname;
	}

	public int getstdsal() {
		return stdnumber;
	}

	public void setStdsal(int stdnumber) {
		this.stdnumber = stdnumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
}
