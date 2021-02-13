package com.my.java;

import java.time.LocalDate;

public class Employee
{
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name,double salary,int year,int month,int day)
	{
		this.name=name;
		this.salary=salary;
		hireDay=LocalDate.of(year, month, day);
	}
	
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public LocalDate hireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double point)
	{
		salary+=salary*point/100;
	}
	
}
