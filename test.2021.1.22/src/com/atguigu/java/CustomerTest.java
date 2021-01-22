package com.atguigu.java;

public class CustomerTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	}
	class Customer
	{
		String name;
		int age;
		boolean isMale;
		public void eat()
		{
			System.out.println("客户吃饭");
		}
		public void sleep(int hour)
		{
			System.out.println("休息了"+hour+"个小时");
		}
		public String getName()
		{
			return name;
		}
		public String getNation(String nation)
		{
			String info="我对国籍是"+nation;
			return info;
		}
	}
}
