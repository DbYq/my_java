package test;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String all=String.join("/","S","M","L","XL");
		System.out.println(all);
		String repeated="Java".repeat(3);
		System.out.println(repeated);
		String arr="Hello";
		String arr2=arr.substring(0,3)+"p me!";
		System.out.println(arr2);
		if(arr2.compareTo(arr2)==0)
		{
			System.out.println("true");
		}//前等于后为0，前小于后为负数，前大于后为正数。
		if(arr2.equals(arr2)==true)
		{
			System.out.println("yes");
		}
	}

}
