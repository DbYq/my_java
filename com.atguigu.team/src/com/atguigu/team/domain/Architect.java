package com.atguigu.team.domain;

public class Architect extends Designer
{
	public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock)
	{
		super(id, name, age, salary, equipment, bonus);
		// TODO Auto-generated constructor stub
		this.stock = stock;
	}

	private int stock;
	
	public int getStock()
	{
		return stock;
	}

}
