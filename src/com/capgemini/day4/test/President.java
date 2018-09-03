package com.capgemini.day4.test;

public class President extends NewEmployee {
       int km;
	public President(String employeeName, long employeeid, double basicSalary, double medicalPercent,int km) {
		super(employeeName, employeeid, basicSalary, medicalPercent);
		this .km=km;

	}
	@Override
	public double actualSalary()
	{
		medical=(basicSalary*medicalPercent)/100;
        Hra=basicSalary/2;
        pf=(basicSalary*12)/100;
        grossSalary=Hra+basicSalary+medical;
        netSalary=grossSalary-(pf-200.00);  
        
        double travelAllowance=8*km;
        double telephoneAllowance=2000.00;
        return (netSalary+travelAllowance+telephoneAllowance);
		
	}
	

}
