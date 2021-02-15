package ShowTest;

public class Teat implements Runnable
{

	private int ticket = 100;

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		while (true)
		{
			show();
		}
	}

}

public synchronized void show()
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
				}
}