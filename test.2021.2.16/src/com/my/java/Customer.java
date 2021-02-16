package com.my.java;

public class Customer implements Runnable
{
	private Account acut;

	public Customer(Account acut)
	{
		this.acut = acut;
	}

	public void run()
	{
		for (int i = 0; i < 3; i++)
		{
			synchronized (Customer.class)
			{
				acut.deposit(1000);
			}
		}
	}
}
