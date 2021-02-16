package AccountTest;

public class AccountTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Account acct=new Account();
		
		Customer cust1=new Customer(acct);
		Customer cust2=new Customer(acct);
		
		cust1.setName("甲");
		cust2.setName("乙");
		
		cust1.start();
		cust2.start();
	}

}
