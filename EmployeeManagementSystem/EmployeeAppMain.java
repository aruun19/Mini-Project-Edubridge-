package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeAppMain {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("----------------- Employee Management System -------------------------");
		System.out.println("----------------------------------------------------------------------");
		String ch;
		EmployeeAppCreation eapp=new EmployeeAppCreation();
		do
		{
		
		System.out.println("\t\t 1)View Employee Information\r\n"
				+ "\t\t 2)Insert Employee Information\r\n"
				+ "\t\t 3)View all Employee Information By Id\r\n"
				+ "\t\t 4)Update Employee Information by Id\r\n"
				+ "\t\t 5)Delete Employee Information by Id");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		
		case 1:	eapp.viewEmployeeInfo();
		break;
		case 2:	eapp.addEmployeeInfo();
		break;
		case 3:	eapp.viewEmployeeInfoById();
		break;
		case 4:	eapp.updateEmployeeById();
		break;
		case 5:	eapp.deleteEmployeeById();
		break;
	    default:System.out.println("Choice not found!"); 		   
		
	    
	    
		}
		
		System.out.println("Do you want to continue? (Y-Yes / N-No)");
		 ch=sc.next();
		}
		while(ch.equals("Y")||ch.equals("y"));
		System.out.println("--------------------------------------------------------------------");

		System.out.println("Goodbye!");
	
		System.out.println("--------------------------------------------------------------------");

		
	}

}
