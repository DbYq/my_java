package com.my.java;

public class Window implements Runnable
{

	private int ticket = 100;

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		while (true)
		{
			synchronized (this)
			{
				if (ticket > 0)
				{
					try
					{
						Thread.sleep(100);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + ":買票，票號為：" + ticket);
					ticket--;
				} else
				{
					break;
				}
			}
		}
	}

}
