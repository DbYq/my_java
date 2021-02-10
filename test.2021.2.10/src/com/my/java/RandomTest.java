package com.my.java;

import java.util.Arrays;
import java.util.Scanner;

public class RandomTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("How many numbers do you need to drow?");
		int n=in.nextInt();
		System.out.println("what is the highest number you can draw?");
		int h=in.nextInt();
		int[] number=new int[h];
		for(int i=0;i<number.length;i++)
		{
			number[i]=i+1;
		}
		int[] result=new int[n];
		for(int i=0;i<result.length;i++)
		{
			result[i]=number[(int)(Math.random()*h)];
			number[(int)(Math.random()*h)]=number[h-1];
			h--;
		}
		Arrays.sort(result);
		System.out.println("Bet the following combination. It'll make you rich!");
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}

}
