package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

public class Programmer extends Employee
{
	private int memberId;//开发团队中的ID
	private Status status;
	private Equipment equipment;
	
	public Programmer(int id,String name,int age,double salary,Equipment equipment)
	{
		super(id,name,age,salary);
		this.equipment=equipment;
	}
	
	public int getMemberId()
	{
		return memberId;
	}
	public Status getStatus()
	{
		return status;
	}
	public Equipment getequipment()
	{
		return equipment;
	}
}
