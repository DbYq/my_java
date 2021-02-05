package com.my.java;

public class ToStringTest
{

	public static void main(String[] args)
	{
		Circle cir1=new Circle(2.3);
		Circle cir2=new Circle(1.3,"white",2.0);
		System.out.println("color is equals ? "+cir1.getColor().equals(cir2.getColor()));
		System.out.println("radius is equals ? "+cir1.equals(cir2));
		System.out.println(cir1.toString());
		System.out.println(cir2.toString());
	}

}
class GeometricObject
{
	protected String color;
	protected double weight;
	protected GeometricObject()
	{
		super();
		this.color="white";
		this.weight=1.0;
	}
	protected GeometricObject(String color,double weight)
	{
		super();
		this.color=color;
		this.weight=weight;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
}
class Circle extends GeometricObject
{
	private double radius;
	public Circle()
	{
		super();
		radius=1.0;
	}
	public Circle(double radius)
	{
		super();
		this.radius=radius;
	}
	public Circle(double radius,String color,double weight)
	{
		super(color,weight);
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double findArea()
	{
		return Math.PI*Math.pow(radius, 2);
	}
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		if(obj instanceof Circle)
		{
			Circle cir=(Circle)obj;
			return this.radius==cir.radius;
		}
		return false;
	}
	public String toString()
	{
		return "Circle [radius="+radius+"]";
	}
}