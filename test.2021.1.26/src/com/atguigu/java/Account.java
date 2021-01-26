package com.atguigu.java;

public class Account
{
	private double balance;
	
	public double getBalance()
	{
		return balance;
	}
	public Account(double init_balance)
	{
		this.balance=init_balance;
	}
	public void deposit(double amt)
	{
		System.out.println("存款成功!!!");
		balance+=amt;
		System.out.println("当前余额:"+balance);
	}
	public void withdraw(double amt)
	{
		if(balance>=amt)
		{
			System.out.println("取款成功!!!");
			balance-=amt;
		}
		else
		{
			System.out.println("余额不足!!!");
		}
		System.out.println("当前余额:"+balance);
	}
}
