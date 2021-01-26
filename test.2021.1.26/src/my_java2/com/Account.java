package my_java2.com;

public class Account
{
	private int id;
	private double balance;
	private double annuallnterestRate;
	public Account(int id,double balance,double annuallnterestRate)
	{
		this.id=id;
		this.balance=balance;
		this.annuallnterestRate=annuallnterestRate;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setAnnuallnterestRate(double annuallnterestRate)
	{
		this.annuallnterestRate=annuallnterestRate;
	}
	public double getAnnuallnterestRate()
	{
		return annuallnterestRate;
	}
	public void withdraw(double amount)
	{
		if(balance<amount)
		{
			System.out.println("余额不足，取款失败!!!");
			return;
		}
		else
		{
			balance-=amount;
		}
		System.out.println("成功取出:"+amount+"元");
		System.out.println("余额: "+balance);
	}
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println("成功存入:"+amount+"元");
		System.out.println("余额: "+balance);
	}
}
