package com.atguigu.java;

public class Bank
{
	private Customer[] customers=new Customer[10];
	private int numberOfCustomer;
	public Bank()
	{
		
	}
	//添加客户
	public void addCustomer(String firstName,String lastName)
	{
		/*
		 * customers[numberOfCustomer]=new Customer(firstName,lastName);
		 * numberOfCustomer++;
		 */
		//或者
		customers[numberOfCustomer++]=new Customer(firstName,lastName);
	}
	//获取客户个数
	public int getNumberOfCustomer()
	{
		return numberOfCustomer;
	}
	//获取指定位置上的客户
	public Customer getCustomer(int index)
	{
		if(index>=0&&index<numberOfCustomer)
		{
			return customers[index];
		}
		else
		{
			return null;
		}
	}
}
