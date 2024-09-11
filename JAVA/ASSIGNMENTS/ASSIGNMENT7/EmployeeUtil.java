package org.india.util;
import java.util.Scanner;

import org.india.domain.Date;
import org.india.domain.Employee;

public class EmployeeUtil {
	private Employee emp = new Employee();
	private static Scanner sc = new Scanner(System.in);
	
	
	public void acceptRecord() {
		System.out.print("Enter Name:: ");
		emp.setName(sc.nextLine());
		sc.nextLine();
		
		System.out.print("Enter ID:: ");
		emp.setEmpid(sc.nextInt());
		
		System.out.print("Enter Salary:: ");
		emp.setSalary(sc.nextFloat());
		
		
		Date joinDate = this.emp.getJoinDate();
		
		System.out.print("Enter day:: ");
		joinDate.setDay(sc.nextInt());
		
		System.out.print("Enter month:: ");
		joinDate.setMonth(sc.nextInt());
		
		System.out.print("Enter Year:: ");
		joinDate.setYear(sc.nextInt());
	}
	
	public void printRecord() {
		System.out.println("Your Name::"+emp.getName());
		System.out.println("Your ID:: "+emp.getEmpid());
		System.out.println("Your Salary:: "+emp.getSalary());
		System.out.println("Your Joining Date:: "+emp.getJoinDate());
	}
	
	
	
	public String toString() {
		return this.emp.getName()+" Employee id "+this.emp.getEmpid()+" his Salary "+this.emp.getSalary()+"and he join on Date "+emp.getJoinDate();
	}
	
	
	public static int menuList() {
		
		System.out.println("0 for Exit");
		System.out.println("1 for Accept");
		System.out.println("2 for Print");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void close() {
		sc.close();
	}
	
}
