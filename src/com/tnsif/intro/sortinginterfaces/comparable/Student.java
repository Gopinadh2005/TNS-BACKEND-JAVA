package com.tnsif.intro.sortinginterfaces.comparable;

public class Student implements Comparable{
	private int sid;
	private String sname;
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		return this.sid-s.sid;
	}
}
