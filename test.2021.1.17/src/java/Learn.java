//家庭收支项目
package java;

import java.util.Scanner;

public class Learn
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("************家庭收支记账系统*************\n");
		System.out.println("*******1.收支明细     2.登记收入*********\n");
		System.out.println("*******3.登记支出     4.退出程序*********\n");
		boolean swit=true;
		while(true)
		{
			System.out.println("请选择》》:\n");
			Scanner in=new Scanner(System.in);
			int Scanf=in.nextInt();
			switch(Scanf)
			{
				case 1:
					System.out.println("1.收支明细:\n");
					break;
				case 2:
					System.out.println("2.登记收入:\n");
					break;
				case 3:
					System.out.println("3.登记支出:\n");
					break;
				case 4:
					System.out.println("是否确认退出?(Yes/No):\n");
					Scanner Scan=new Scanner(System.in);
					String Scanf2=Scan.nextLine();
					if(Scanf2=="Yes")
					{
						swit=false;
					}
					break;
				default :
					System.out.println("输入错误，请重新输入！！！\n");
					break;
			}
		}
	}

}
