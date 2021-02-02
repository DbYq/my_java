package com.my_java.test;

public class CheckAccountTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CheckAccount ca=new CheckAccount(1122,20000,0.045,5000);
		ca.withdraw(5000);
		System.out.println("账户余额："+ca.getBalance());
		System.out.println("可透支额度："+ca.getOverdraft());
		ca.withdraw(18000);
		System.out.println("账户余额："+ca.getBalance());
		System.out.println("可透支额度："+ca.getOverdraft());
		ca.withdraw(3000);
		System.out.println("账户余额："+ca.getBalance());
		System.out.println("可透支额度："+ca.getOverdraft());
	}

}
