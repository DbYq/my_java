package com.my.java;

public abstract class Employ
{
	private String name;
	private int id;
	private double salary;
	
	public Employ()
	{
		
	}
	public Employ(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public abstract void work();
	
}
class Manager extends Employ
{
	private double bonus;
	
	public void work()
	{
		System.out.println("manage company and take a good job!!!");
	}
	
	public Manager(double bonus)
	{
		super();
		this.bonus=bonus;
	}
	public Manager(String name,int id,double salary,double bonus)
	{
		super(name,id,salary);
		this.bonus=bonus;
	}
}
class CommonEmployee extends Employ
{
	public void work()
	{
		System.out.println("employees at the company word hard!!!");
	}
}
