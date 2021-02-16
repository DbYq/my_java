package com.my.java;

public class AccountTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Account acut=new Account(0);
		Customer c=new Customer(acut);
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		
		t1.setName("甲");
		t2.setName("乙");
		
		t1.start();
		t2.start();
	}

}
