package com.capgemini.day4.test;

public class Employee 
{
	int employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhoneNo;
	double basicSalary;
//	double salary;
	final double SPECIAL_ALLOWANCES = 250.80;
	final double HRA=1000.00;
	
	public Employee(){
		
	}
	Employee(int employeeId,String employeeName,String employeeAddress,long employeePhoneNo) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAddress=employeeAddress;
		this.employeePhoneNo=employeePhoneNo;
		
	}
	
	public double calculateSalary()
	{
		double salary=basicSalary+((basicSalary*SPECIAL_ALLOWANCES)/100)+((basicSalary*HRA)/100);
		return salary;
	}

}
