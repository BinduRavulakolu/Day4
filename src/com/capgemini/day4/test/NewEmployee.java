package com.capgemini.day4.test;

public class NewEmployee {
	String employeeName;
	static long employeeId;
	double basicSalary;
	double medicalPercent;
	double Hra;
	double pf;
	double grossSalary;
	static double netSalary;
	double medical;
	 public NewEmployee(String employeeName,long employeeid,double basicSalary, double medicalPercent)
	 {
		 this.employeeName=employeeName;
		 this.employeeId=employeeid;
		 this.basicSalary=basicSalary;
		 this.medicalPercent=medicalPercent;
	 }
	
	public  double actualSalary()
	{
		    medical=(basicSalary*medicalPercent)/100;
            Hra=basicSalary/2;
            pf=(basicSalary*12)/100;
            grossSalary=Hra+basicSalary+medical;
            netSalary=grossSalary-(pf-200.00);
            return netSalary;

	}
	
	public static void employeeDetails()
	{
		System.out.println("Employye id: "+employeeId+"\nNet Salary: " +netSalary);
	}

//	public static double returningSalary() {
//		// TODO Auto-generated method stub
//		return netSalary;
//	}

}
