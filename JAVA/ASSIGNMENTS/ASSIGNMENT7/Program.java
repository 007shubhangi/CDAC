package org.india.main;
import org.india.domain.Date;
import org.india.domain.Employee;
import  org.india.util.EmployeeUtil;


public class Program {

	public static void main(String[] args) {
		EmployeeUtil util = new EmployeeUtil();
		int choice;
		
		while((choice=EmployeeUtil.menuList())!=0) {
			switch (choice) {
			case 1:
				util.acceptRecord();
				break;
				
			case 2:
				util.printRecord();
				break;
			}
		}
		System.out.println(util.toString());

	}

}
