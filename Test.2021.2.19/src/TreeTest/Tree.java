package TreeTest;

import java.io.File;

public class Tree
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		File f=new File("c:/我的初学代码");
		printFile(f,0);
	}

	static void printFile(File f,int level)
	{
		for(int i=0;i<level;i++)
		{
			System.out.print("-");
		}
		System.out.println(f.getName());
		if(f.isDirectory())
		{
			File[] files=f.listFiles();
			for(File temp:files)
			{
				printFile(temp,level+1);
			}
		}
	}
}