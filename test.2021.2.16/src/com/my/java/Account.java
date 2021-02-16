package com.my.java;

public class Account
{
	private double balance;

	public Account(double balance)
	{
		this.balance = balance;
	}

	public void deposit(double atm)
	{
		
		if(atm>0)
		{
			balance+=atm;
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"存款成功：賬戶餘額為："+balance);
		}
	}
}
