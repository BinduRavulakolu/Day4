package com.capgemini.day4.test;

public class SalesManager extends NewEmployee {

	public SalesManager(String employeeName, long employeeid, double basicSalary, double medicalPercent) {
		super(employeeName, employeeid, basicSalary, medicalPercent);
		
	}
	@Override
	public double actualSalary()
	{
		medical=(basicSalary*medicalPercent)/100;
        Hra=basicSalary/2;
        pf=(basicSalary*12)/100;
        grossSalary=Hra+basicSalary+medical;
        netSalary=grossSalary-(pf-200.00);  
        
		double petrolAllowance=(basicSalary*8)/100;
		double foodAllowance=(basicSalary*13)/100;
		double otherAllowance=(basicSalary*3)/100;
		double netSalarySales=netSalary+petrolAllowance+foodAllowance+otherAllowance;
		return netSalarySales;
	}
	

	

}
