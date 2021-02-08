package com.my.java;

public class USBTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Computer computer=new Computer();
		Flash fla=new Flash();
		computer.transferDate(fla);//此处本应填入Date类型，但其不能实例化，所以填入其类的实例化
		Printer pri=new Printer();
		computer.transferDate(pri);
		//以上为非匿名实现类的非匿名对象
		System.out.println("***********************************");
		computer.transferDate(new Flash());
		computer.transferDate(new Printer());
		//以上为非匿名实现类的匿名对象
		System.out.println("***********************************");
		USB phone=new USB()
		{
			public void start()
			{
				System.out.println("the phone is start work");
			}
			public void stop()
			{
				System.out.println("the phone is stop work");
			}
	    };
	    computer.transferDate(phone);
	    //以上为匿名实现类的非匿名对象
	    System.out.println("***********************************");
	    computer.transferDate(new USB() {
	    	public void start()
			{
				System.out.println("the phone is start work");
			}
			public void stop()
			{
				System.out.println("the phone is stop work");
			}
	    });
	    //以上为匿名实现类的匿名对象
	}

}

interface USB
{
	public abstract void start();
	public abstract void stop();
	
}
class Flash implements USB
{
	public void start()
	{
		System.out.println("the date is start input in flash");
	}
	public void stop()
	{
		System.out.println("the date is stop input in flash");
	}
}

class Printer implements USB
{
	public void start()
	{
		System.out.println("the date is start input in printer");
	}
	public void stop()
	{
		System.out.println("the date is stop input in printer");
	}
}

class Computer
{
	public void transferDate(USB usb)
	{
		usb.start();
		System.out.println("to input");
		usb.stop();
	}
}