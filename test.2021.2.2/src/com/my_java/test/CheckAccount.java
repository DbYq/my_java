package com.my_java.test;

public class CheckAccount extends Account
{
	private double overdraft;
	public CheckAccount(int id,double balance,double annuallnterestRate,double overdraft)
	{
		super(id,balance,annuallnterestRate);
		this.overdraft=overdraft;
	}
	public double getOverdraft()
	{
		return overdraft;
	}
	public void setOverdraft(double overdraft)
	{
		this.overdraft=overdraft;
	}
	public void withdraw(double amount)
	{
		if(getBalance()>=amount)
		{
			//setBalance(getBalance()-amount);
			super.withdraw(amount);
		}
		else if(overdraft>=amount-getBalance())
		{
			overdraft-=(amount-getBalance());
			setBalance(0);
		}
		else
		{
			System.out.println("超出可透支限额！！！");
		}
	}
}
