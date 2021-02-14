package com.atguigu.team.domain;

public class Printer implements Equipment
{
	private String name;// 机器型号
	private String type;// 机器类型

	public Printer(String name, String type)
	{
		this.name = name;
		this.type = type;
	}

	public String getName()
	{
		return name;
	}

	public String getType()
	{
		return type;
	}

	@Override
	public String getDescription()
	{
		// TODO Auto-generated method stub
		return name + "(" + type + ")";
	}

}
