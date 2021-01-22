package com.atguigu.java;
/*
 * 可变个数的形参:数据类型...变量名----------其使用方法与数组相同
 * 但是编译器会认为（可变形参与本类中方法名相同，形参类型也相同的数组不构成重载，二者不能共存）
 * 
 * 必须声明在末尾：public void show(int i,String...strs){}
 */
public class InstanceTest
{
	public static void main(String[] args)
	{
		InstanceTest test=new InstanceTest();
		/*
		 * test.show("Hallo","World"); test.show(); test.show("hi");
		 *///不管是调用0个或者多个都可以，我们把它称之为可变个数的形参
		test.show("AA","BB","CC");
	}
	public void show(String...strs)
	{
		for(int i=0;i<strs.length;i++)
		{
			System.out.println(strs[i]);
		}
		
	}
}
