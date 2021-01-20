package learn;

import java.util.Scanner;

//数组训练:找最小值
public class test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//int[] a= {1,2,3,4,};
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] score=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			score[i]=in.nextInt();
		}
		int min=score[0];
		for(i=0;i<n;i++)
		{
			if(score[i]<min)
			{
				min=score[i];
			}
		}
		System.out.println("最低成绩:"+min);
	}
	
}
