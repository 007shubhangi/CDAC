package org.india.domain;
import org.india.domain.Date;

public class Employee {
	
	private String name;
	private int empid;
	private float salary;
	private Date joinDate = new Date();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	
	public String toString() {
		return this.name+"  "+this.empid+"  "+this.salary;
	}
	
	
	
}