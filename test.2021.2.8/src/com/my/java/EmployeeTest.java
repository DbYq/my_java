package com.my.java;

public class EmployeeTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Manager manager=new Manager("kuke",1001,5000,50000);
		manager.work();
		CommonEmployee coem=new CommonEmployee();
		coem.work();
	}

}
