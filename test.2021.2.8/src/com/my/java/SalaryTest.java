package com.my.java;

import java.util.Scanner;

public class SalaryTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		var emply=new Employee[5];
		emply[0]=new SalariedEmployee("Toni",1001,new MyDate(1992,2,28),10000);
		emply[1]=new HourlyEmployee("Mason",1002,new MyDate(1991,5,6),60,240);
		emply[2]=new SalariedEmployee("Tom",1003,new MyDate(1990,6,4),21000);
		emply[3]=new SalariedEmployee("Jain",2003,new MyDate(2001,4,8),20000);
		emply[4]=new HourlyEmployee("Jack",3007,new MyDate(1997,7,29),55,250);
		Scanner in=new Scanner(System.in);
		System.out.println("when is the month ? please you input that:");
		int amonth=in.nextInt();
		for(int i=0;i<5;i++)
		{
			System.out.println(emply[i]);
			System.out.println("the monthly salary is:"+emply[i].earnings());
			if(emply[i].getBirthday().getMonth()==amonth)
			{
				System.out.println("Today is "+emply[i].getName()+" birthday,give he(she) 100$ to courage!!!");
			}
		}
	}
}
abstract class Employee
{
	private String name;
	private int number;
	private MyDate birthday;
	
	public Employee(String name,int number,MyDate birthday)
	{
		this.name=name;
		this.number=number;
		this.birthday=birthday;
	}
	
	public abstract double earnings();
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setNumber(int number)
	{
		this.number=number;
	}
	public int getNumber()
	{
		return number;
	}
	public void setBirthday(MyDate birthday)
	{
		this.birthday=birthday;
	}
	public MyDate getBirthday()
	{
		return birthday;
	}

	public String toString()
	{
		return "name:"+name+",number:"+number+",birthday:"+birthday.toDateString();
	}
}
class MyDate
{
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year,int month,int day)
	{
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return year; 
	}
	public void setMonth(int month)
	{
		this.month=month;
	}
	public int getMonth()
	{
		return month;
	}
	public void setDay(int day)
	{
		this.day=day;
	}
	public int getDay()
	{
		return day;
	}
	
	public String toDateString()
	{
		return year+"."+month+"."+day;
	}
}
class SalariedEmployee extends Employee
{
	private double monthlySalary;
	
	public SalariedEmployee(String name,int number,MyDate birthday,double monthlySalary)
	{
		super(name,number,birthday);
		this.monthlySalary=monthlySalary;
	}
	
	public void setMonthlySalary(double monthlySalary)
	{
		this.monthlySalary=monthlySalary;
	}
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	
	public double earnings()
	{
		return monthlySalary;
	}
	public String toString()
	{
		return "Employee's["+super.toString()+"]";
	}
}
class HourlyEmployee extends Employee
{
	private double wage;
	private double hour;
	
	public HourlyEmployee(String name,int number,MyDate birthday,double wage,double hour)
	{
		super(name,number,birthday);
		this.wage=wage;
		this.hour=hour;
	}
	
	public void setWage(double wage)
	{
		this.wage=wage;
	}
	public double getWage()
	{
		return wage;
	}
	public void setHour(double hour)
	{
		this.hour=hour;
	}
	public double getHour()
	{
		return hour;
	}
	
	public double earnings()
	{
		return wage*hour;
	}
	
	public String toString()
	{
		return "Employee's["+super.toString()+"]";
	}
}