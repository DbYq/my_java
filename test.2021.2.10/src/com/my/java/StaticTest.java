package com.my.java;

public class StaticTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		var staff=new Employee[3];
		staff[0]=new Employee("Tom",40000);
		staff[1]=new Employee("Dick",60000);
		staff[2]=new Employee("Harry",65000);
		for(Employee e:staff)
		{
			e.setId();
			System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
		}
	}

}
class Employee
{
	private static int nextId=1;
	private String name;
	private double salary;
	private int id;
	
	public Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
		id=0;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setId()
	{
		id=nextId;
		nextId++;
	}
	public int getId()
	{
		return id;
	}
	public static int getNextId()
	{
		return nextId;
	}
	
	
	  public static void main(String[] args) { var e=new Employee("Harry",50000);
	  System.out.println(e.getName()+" "+e.getSalary()); }
	 
	
}