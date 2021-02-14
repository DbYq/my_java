package com.atguigu.team.domain;

public class PC implements Equipment
{

	private String model;//机器型号
	private String display;//显示器名称
	
	public PC(String model,String display)
	{
		this.model=model;
		this.display=display;
	}
	
	public String getModel()
	{
		return model;
	}
	public String getDisplay()
	{
		return display;
	}
	
	@Override
	public String getDescription()
	{
		// TODO Auto-generated method stub
		return model + "(" + display + ")";
	}
	
}
