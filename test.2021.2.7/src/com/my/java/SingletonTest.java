package com.my.java;

public class SingletonTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Bank b1=Bank.getInstance();
		Bank b2=Bank.getInstance();
		System.out.println(b1==b2);
	}

}
//饿汉式：线程安全
/*
 * class Bank { private Bank() {
 * 
 * } private static Bank instance=new Bank(); public static Bank getInstance() {
 * return instance; } }
 */
//懒汉式:线程不安全，需改动
class Bank
{
	private Bank()
	{
		
	}
	public static Bank instance=null;
	public static Bank getInstance()
	{
		if(instance==null)
		{
			instance=new Bank();
		}
		return instance;
	}
}