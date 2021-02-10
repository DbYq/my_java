package com.my.java;

public class CopyTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] smallprimes=new int[10];
		int[] luckNumbers=smallprimes;
		luckNumbers[5]=13;
		System.out.println(smallprimes[5]);
		
		System.out.println(Math.random()*400);
		
	}

}
