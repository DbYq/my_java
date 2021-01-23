package my_java.com;

public class TransferTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TransferTest test=new TransferTest();
		test.first();
	}
	public void first()
	{
		int i=5;
		Value v=new Value();
		v.i=25;
		second(v,i);
		System.out.println(v.i);
	}
	public void second(Value v,int i)
	{
		i=0;
		v.i=20;
		Value val=new Value();
		v=val;
		System.out.println(v.i+" "+i);
	}

}
class Value
{
	int i=15;
}