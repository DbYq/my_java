package com.my_java.test;

public class StaticTest
{
	public static void main(String[] args)
	{
		Employee[] staff=new Employee[3];
		staff[0]=new Employee("Tom",40000);
		staff[1]=new Employee("Dick",60000);
		staff[2]=new Employee("Harry",65000);
	}
}
class Employees
{
	private static int nextId=1;
	private String name;
	private double salary;
	private int id;
	public Employees(String n,double s)
	{
		name=n;
		salary=s;
		id=0;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getId()
	{
		return id;
	}
	public void setId()
	{
		id=nextId;
		nextId++;
	}
	public static int getNextId()
	{
		return nextId;
	}
	public static void main(String[] args)
	{
		Employees e=new Employees("Harry",50000);
		System.out.println(e.getName()+" "+e.getSalary());
	}
	
}