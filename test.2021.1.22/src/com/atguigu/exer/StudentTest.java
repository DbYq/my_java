package com.atguigu.exer;
//创建20个学生
public class StudentTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student[] stu=new Student[20];
		for(int i=0;i<stu.length;i++)
		{
			stu[i]=new Student();
			stu[i].number=i+1;
			stu[i].state=(int)(Math.random()*(6-1+1)+1);
			stu[i].score=(int)(Math.random()*(100-0+1));
		}
		for(int i=0;i<stu.length;i++)
		{
			if(stu[i].state==3)
			{
				System.out.println(stu[i].info());
			}
		}
		System.out.println("******************************************");
		for(int i=0;i<stu.length-1;i++)
		{
			for(int j=0;j<stu.length-1-i;j++)
			{
				if(stu[j].score<stu[j+1].score)
				{
					Student temp=stu[j];
					stu[j]=stu[j+1];
					stu[j+1]=temp;
				}
			}
		}
		for(int i=0;i<stu.length;i++)
		{
			System.out.print("第"+i+1+"名:");
			System.out.println(stu[i].info());
		}
	}
	
}
class Student
{
	int number;
	int state;
	double score;
	public String info()
	{
		return "学号"+number+",年级"+state+",成绩"+score;
	}
}
