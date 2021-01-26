package my_java2.com;

public class Customer
{
	private String firstName;
	private String lastName;
	private Account account;
	public Customer(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setAccount(Account account)
	{
		this.account=account;
	}
	public Account getAccount()
	{
		return account;
	}
}
