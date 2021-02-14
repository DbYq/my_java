package com.atguigu.team.domain;

public class Designer extends Programmer
{
	private double bonus;
	
	public Designer(int id, String name, int age, double salary,Equipment equipment,double bonus)
	{
		super(id, name, age, salary, equipment);
		// TODO Auto-generated constructor stub
		this.bonus=bonus;
	}

	public double getBonus()
	{
		return bonus;
	}
	
	
}
