package com.atguigu.exer;

public class Person
{
	String name;
	int age;
	String sex;
	public void study()
	{
		System.out.println("studying");
	}
	public void showAge()
	{
		System.out.println("age:"+age);
	}
	public int addAge(int i)
	{
		age+=i;
		return age;
	}
}
