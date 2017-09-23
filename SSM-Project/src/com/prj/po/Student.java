package com.prj.po;

import java.io.Serializable;

public class Student implements Serializable {
	private int stuid;
	private String stuname;
	private String stuhobby;
	private Classtable ct;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stuid, String stuname, String stuhobby, Classtable ct) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stuhobby = stuhobby;
		this.ct = ct;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getStuhobby() {
		return stuhobby;
	}

	public void setStuhobby(String stuhobby) {
		this.stuhobby = stuhobby;
	}

	public Classtable getCt() {
		return ct;
	}

	public void setCt(Classtable ct) {
		this.ct = ct;
	}

}
