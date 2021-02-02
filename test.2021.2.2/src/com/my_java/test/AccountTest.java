package com.my_java.test;

public class AccountTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Account account=new Account(1122,20000,0.045);
		account.withdraw(300000);
		System.out.println("余额："+account.getBalance());
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("余额："+account.getBalance());
		System.out.println("月利率："+account.getMonthiyInterest()*100+"%");
	}

}
