package com.my_java.test;

public class Account
{
	private int id;
	private double balance;
	private double annuallnterestRate;
	public Account()
	{
		
	}
	public Account(int id,double balance,double annuallnterestRate)
	{
		this.id=id;
		this.balance=balance;
		this.annuallnterestRate=annuallnterestRate;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getAnnuallnterestRate()
	{
		return annuallnterestRate;
	}
	public void setAnnuallnterestRate(double annuallnterestRate)
	{
		this.annuallnterestRate=annuallnterestRate;
	}
	public double getMonthiyInterest()
	{
		return annuallnterestRate/12;
	}
	public void withdraw(double amount)
	{
		if(balance<amount)
		{
			System.out.println("余额不足!!!");
		}
		else
		{
			balance-=amount;
		}
	}
	public void deposit(double amount)
	{
		balance+=amount;
	}
}
