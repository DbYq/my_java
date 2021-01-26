package my_java.com;

public class BoyGirlTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Boy boy=new Boy();
		boy.setName("Tom");
		boy.setAge(21);
		boy.shout();
		
		Girl girl=new Girl();
		girl.setName("Mary");
		girl.setAge(18);
		girl.marry(boy);
		
		Girl girl1=new Girl();
		girl1.setName("祝英台");
		girl1.setAge(19);
		girl.compare(girl1);
		if(girl.compare(girl1)>0)
		{
			System.out.println("Mary大");
		}
		else if(girl.compare(girl1)<0)
		{
			System.out.println("祝英台大");
		}
		else
		{
			System.out.println("一样大");
		}
	}

}
