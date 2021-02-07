package com.my.java;
/*
 * 1.the static that can include the printf
 * 2.do not have the static that can have printf too
 */
public class BlockTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	}

}
class Person
{
	String name;
	int age;
	static String desc="I am a man";
	public Person()
	{
		
	}
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	{
		
	}
	
	public void eat()
	{
		System.out.println("people eat something");
	}
	public String toString()
	{
		return "people[name:"+name+",age"+age+",desc:"+desc+"]"; 
	}
}