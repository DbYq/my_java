package com.my.java;

public class Manager extends Employee
{

	private double bonus;
	public Manager(String name, double salary, int year, int month, int day)
	{
		super(name, salary, year, month, day);
		// TODO Auto-generated constructor stub
	}
	public double getSalary()
	{
		return super.getSalary()+bonus;
	}
	public void setBonus(double bonus)
	{
		this.bonus=bonus;
	}
	
}
