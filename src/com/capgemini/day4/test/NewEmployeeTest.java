package com.capgemini.day4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class NewEmployeeTest {
	NewEmployee details; 
	SalesManager manager;
	President president;
	@BeforeEach
	void setUp() {
		 details = new NewEmployee("Raju",1234567,45000.0,15);
	}


	@Test
	void testCalculateSalary() {
		assertEquals(69050.00,details.actualSalary());
	}
	@Test
	void testDisplay()
	{
		NewEmployee.employeeDetails();
	}
	
	
	@Test
	void testSalesManagerSalary() {
		manager=new SalesManager("Ravi", 1234576, 45000.0, 7);
		assertEquals(76250.00,manager.actualSalary());
	}
	@Test
	void testPresidentSalary() {
		president=new President("Ravi", 1234576, 45000.0, 7,3);
		assertEquals(67474.00,president.actualSalary());
	}
}
