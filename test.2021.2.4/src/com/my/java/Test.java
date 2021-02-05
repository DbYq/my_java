package com.my.java;
/*
 * 
 * 1. "=="使用其对比引用类型的所比较的都是地址值。
 * 2.equals的使用:
 * 是一个方法，而非运算符，只能适用于引用数据类型
 * Object中equals的作用相当于"=="
 */
public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub	
		Order ord1=new Order(10,"AA");
		Order ord2=new Order(10,"bb");
		System.out.println(ord1.equals(ord2));
		Order ord3=new Order(10,"AA");
		System.out.println(ord1.equals(ord3));
	}

}
class Order
{
	private int orderId;
	private String orderName;
	public Order(int orderId,String orderName)
	{
		super();
		this.orderId=orderId;
		this.orderName=orderName;
	}
	public int getOrderId()
	{
		return orderId;
	}
	public void setOrderId(int orderId)
	{
		this.orderId=orderId;
	}
	public String getOrderName()
	{
		return orderName;
	}
	public void setOrderName(String orderName)
	{
		this.orderName=orderName;
	}
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		if(obj instanceof Order)
		{
			Order order=(Order)obj;
			return this.orderId==order.orderId&&
					this.orderName.equals(order.orderName);
		}
		return false;
	}
}