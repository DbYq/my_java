package com.atguigu.team.domain;

public class NoteBook implements Equipment
{
	private String model;
	private double price;

	public NoteBook(String model, double price)
	{
		this.model = model;
		this.price = price;
	}

	public String getModel()
	{
		return model;
	}

	public double getPrice()
	{
		return price;
	}

	@Override
	public String getDescription()
	{
		// TODO Auto-generated method stub
		return model + "(" + price + ")";
	}

}
