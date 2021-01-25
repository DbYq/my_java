package my_java.com;

import java.util.Scanner;

public class passObject
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int time=in.nextInt();		
		passObject test=new passObject();
		Circle c=new Circle();
		System.out.println("Radius\t\tArea");
		test.printAteas(c,time);
		System.out.println("Now Radius is "+c.radius);
		
	}
	public void printAteas(Circle c,int time)
	{
		double i;
		for(i=1;i<=time;i++)
		{
			c.radius=i;
			System.out.println(c.radius+"\t\t"+c.findAreas());
		}
		c.radius=i;
	}
	
}
