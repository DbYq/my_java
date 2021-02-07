package com.my.java;
/*
 * static:静态的
 * static:可以用来修饰：属性、方法、代码块、内部类
 * 使用static来修饰属性
 * 使用static来修饰方法
 * 
 */
public  class  StaticTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Account acut1=new Account("Tom","135785");
		Account acut2=new Account("Mary","038950");
		Account acut3=new Account("Jack","096123");
		System.out.println(acut1);
		System.out.println(acut2);
		System.out.println(acut3);
	}

}
 class Account
{
	private int id;
	private String name;
	private String password="000000";
	private double balance;
	private static double interestRate=0.032;
	private static double minBalance=0.0;
	private static int init=1001;
	public Account(String name,String password)
	{
		id=init++;
		this.password=password;
		this.balance=balance;
		this.name=name;
	}
	public double getBalance()
	{
		return balance;
	}
	public static double getInterestRate()
	{
		return interestRate;
	}
	public static double getminBalance()
	{
		return minBalance;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return "Account [id:"+id+",name:"+name+",password:"+password+",balance:"+balance+"]";
	}
}