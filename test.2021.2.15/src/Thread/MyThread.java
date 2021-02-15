package Thread;

public class MyThread extends Thread
{
	public void run()
	{
		for (int i = 1; i < 100; i++)
		{
			if (i % 2 == 0)
			{
				System.out.printf("%d ", i);
			}
		}
	}
}
