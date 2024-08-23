package com.evergent.corejava.javabeans;

import java.io.NotSerializableException;
import java.io.Serializable;
public class Student implements Serializable {
	private int sno;
	private String sname;
	private double fee;
	public void setEno(int sno) {
		this.sno=sno;
	}
	public void setEname(String sname) {
		this.sname=sname;
	}
	public void setSal(double fee) {
		this.fee=fee;
	}
	public String toString() {
		return "Student no:"+sno+"/n Student name:"+sname+"/n student fee:"+fee;
	}
}
