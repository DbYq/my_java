package AccountTest;

public class Account
{
	private double balance;

	public Account(double balance)
	{
		this.balance = balance;
	}

	public Account()
	{
		// TODO Auto-generated constructor stub
	}

	// 存錢
	public synchronized void deposit(double amt)
	{
		if (amt > 0)
		{
			balance += amt;
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "存錢成功!!!餘額為:" + balance);
		}
	}
}
