package com.prj.po;

import java.io.Serializable;
import java.util.List;

public class Classtable implements Serializable{
	private int cid;
	private String cname;
	private List<Student> lsst;
	public Classtable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classtable(int cid, String cname, List<Student> lsst) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.lsst = lsst;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Student> getLsst() {
		return lsst;
	}
	public void setLsst(List<Student> lsst) {
		this.lsst = lsst;
	}
	
	

}
