package com.atguigu.exer;

public class PersonTest
{
	public static void main(String[] args)
	{
		Person p1=new Person();
		p1.name="Tom";
		p1.age=20;
		p1.sex="male";
		p1.study();
		p1.showAge();
		//int newAge=p1.addAge(2);
		System.out.println("newAge:"+p1.addAge(2));
	}
}
