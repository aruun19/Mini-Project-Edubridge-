package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeAppCreation {
	static Scanner sc=new Scanner(System.in);

	ArrayList<Employee> empList=new ArrayList<Employee>();
	EmployeeAppCreation()
	{
		
		empList.add(new Employee(1001,"Nithin","Korattur","Tech Dept","9677607027"));
		empList.add(new Employee(1002,"Sukumar","Anna Nagar","Finance Dept","9952016585"));
		empList.add(new Employee(1003,"Sambu","Annanur","HR Dept","9094136342"));
	}
	public void viewEmployeeInfo()
	{   		
		System.out.println("-------------------------------------------------------------------------------------------------");

		if(empList.size()==0)
		{
			System.out.println("No record found!");
		}
		
		
		for(Employee e:empList)
		{
			
				System.out.println("Employee Id:"+e.getEmpId()+"\tEmployee Name:"+e.getEmpName()+"\t Dept:"+e.getEmpDept()+"\t Address:"+e.getEmpAddress()+"\t Contact:"+e.getEmpContact());
			
		}
		System.out.println("-------------------------------------------------------------------------------------------------");


	}
	public void addEmployeeInfo() 
	{
		System.out.println("Enter Employee Id: ");
		int empId=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String empName=sc.next();
		System.out.println("Enter Employee Address: ");
		String empAddress=sc.next();
		System.out.println("Enter Employee Dept: ");
		String empDept=sc.next();
		System.out.println("Enter Employee Contact: ");
		String empContact=sc.next();
		
		Employee e=new Employee(empId, empName, empAddress, empDept, empContact);
		
		empList.add(e);
	}
	public void viewEmployeeInfoById() 
	{
		System.out.println("Enter Employee Id:");
		int empId=sc.nextInt();
	    int flag=0;
		System.out.println("-------------------------------------------------------------------------------------------------");

		for(Employee e:empList)
		{
			if(empId==e.getEmpId())
			{   flag=1;
				System.out.println("Employee Name:"+e.getEmpName()+"\t "
						+ "Dept:"+e.getEmpDept()+"\t "
								+ "Address:"+e.getEmpAddress()+
								"\t Contact:"+e.getEmpContact());
			}
		}
		
		if(flag==0)
			System.out.println("Employee Id does not exist!");
		System.out.println("-------------------------------------------------------------------------------------------------");

	}
	public void updateEmployeeById()
	{
		System.out.println("Enter Employee id:");
		int empId=sc.nextInt();
	    int flag=0,index=0;
	    Employee e=null;
	    for(Employee emp:empList)
	    {
	    	if(emp.getEmpId()==empId)
	    	{
	    		flag=1;
	    		index=empList.indexOf(emp);
	    		System.out.println(index);
	    		e=emp;
	    		break;
	    	}
	    }
	    
	    if(flag==1)
	    {
	    	System.out.println("Enter Employee Name: ");
			String empName=sc.next();
			System.out.println("Enter Employee Address: ");
			String empAddress=sc.next();
			System.out.println("Enter Employee Dept: ");
			String empDept=sc.next();
			System.out.println("Enter Employee Contact: ");
			String empContact=sc.next();
			
			e.setEmpName(empName);
			e.setEmpAddress(empAddress);
			e.setEmpDept(empDept);
			e.setEmpContact(empContact);
			
			empList.set(index,e);
			System.out.println("-------------------------------------------------------------------------------------------------");

	    }
	    else
	    {
	    	System.out.println("Id does not exist!");
	    }
	    System.out.println("-------------------------------------------------------------------------------------------------");

	}
	public void deleteEmployeeById() 
	{
		System.out.println("Enter Employee Id :");
		int empId=sc.nextInt();
		int index=0,flag=0;
		Employee e=null;
		
		for(Employee emp:empList)
		{
			if(empId==emp.getEmpId())
			{
				flag=1;
				index=empList.indexOf(emp);
				e=emp;
				System.out.println(index);
				System.out.println(emp);
				break;
			}
		}
		System.out.println("-------------------------------------------------------------------------------------------------");

		if(flag==0)
		{
			System.out.println("Employee Id does not exist!");
		}
		else
		{
			empList.remove(e);
			System.out.println("Employee record deleted successfully!");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------");

	}

}
