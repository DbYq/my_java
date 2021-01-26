package my_java2.com;

public class CustomerTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Account account=new Account(1000,2000,0.0123);
		Customer customer=new Customer("Jane", "Smith");
		customer.setAccount(account);
		customer.getAccount().deposit(100);
		customer.getAccount().withdraw(960);
		customer.getAccount().withdraw(2000);
		System.out.println("Customer ["+customer.getFirstName()+","+customer.getLastName()+"] has a accout:");
		System.out.println("id is"+account.getId()+", annualInterestRate is "+account.getAnnuallnterestRate()
		*100+"% ,balance is "+account.getBalance());
	}

}
