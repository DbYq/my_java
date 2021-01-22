package com.atguigu.java;
//传址调用
public class ValueTransfer
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Date date=new Date();
		date.m=10;
		date.n=20;
		System.out.println("m="+date.m+",n="+date.n);
		ValueTransfer test=new ValueTransfer();
		test.swap(date);
		System.out.println("m="+date.m+",n="+date.n);
	}
	public void swap(Date date)
	{
		int temp=date.m;
		date.m=date.n;
		date.n=temp;
	}
}
class Date
{
	int m;
	int n;
}