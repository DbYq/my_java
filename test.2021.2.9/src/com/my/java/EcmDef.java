package com.my.java;

public class EcmDef
{
	public static void main(String[] args)
	{
		try
		{
			double ia=Double.parseDouble(args[0]);
			double ja=Double.parseDouble(args[1]);
			System.out.println(ecm(ia,ja));
		}
		catch(NumberFormatException e)
		{
			System.out.println("数据类型不一致");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("缺少命令行参数");
		}
		catch(ArithmeticException e)
		{
			System.out.println("除0");
		}
		catch(EcDef e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public static double ecm(double i,double j) throws EcDef
	{
		if(i<0||j<0)
		{
			throw new EcDef("分子或分母为负数");
		}
		return i/j;
	}
}
class EcDef extends Exception
{
	static final long serialVersionUID = -338751699312429948L;
	public EcDef()
	{
		
	}
	public EcDef(String msg)
	{
		super(msg);
	}
}