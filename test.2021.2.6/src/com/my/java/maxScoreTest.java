package com.my.java;

import java.util.Scanner;
import java.util.Vector;

public class maxScoreTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Vector v=new Vector();
		int maxScore=0;
		for(;;)
		{
			System.out.println("请输入学生成绩：");
			int score=in.nextInt();
			if(score<0)
			{
				break;
			}
			if(maxScore<score)
			{
				maxScore=score;
			}
			v.addElement(score);
		}
		char level;
		for(int i=0;i<v.size();i++)
		{
			Object obj=v.elementAt(i);
			int score=(int)obj;
			if(maxScore-score<=10)
			{
				level='A';
			}
			else if(maxScore-score<=20)
			{
				level='B';
			}
			else if(maxScore-score<=30)
			{
				level='C';
			}
			else
			{
				level='D';
			}
			System.out.println("student:"+i+",score is"+score+",level is"+level);
		}
		
	}

}
