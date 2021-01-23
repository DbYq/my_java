package my_java.com;

public class swapTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Date date=new Date();
		date.m=10;
		date.n=20;
		System.out.println("m="+date.m+",n="+date.n);
		swapTest test=new swapTest();
		test.swap(date);
		System.out.println("m="+date.m+",n="+date.n);
	}
	public void swap(Date date)
	{
		int temp=date.m;
		date.m=date.n;
		date.n=temp;
	}
	
}
class Date
{
	int m;
	int n;
}