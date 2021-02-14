package com.atguigu.team.domain;

public class Employee
{
	private int id;
	private String name;
	private int age;
	private double salary;
	
	public Employee(int id,String name,int age,double salary)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.salary=salary;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public double getSalary()
	{
		return salary;
	}
}
