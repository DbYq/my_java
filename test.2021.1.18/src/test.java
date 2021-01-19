//暂存：
import java.util.Scanner;
public class test
{
	public static void main(String[] args)
	{
		System.out.println("************家庭收支记账系统*************\n");
		System.out.println("*******1.收支明细     2.登记收入*********\n");
		System.out.println("*******3.登记支出     4.退出程序*********\n");
		System.out.println("请输入》:\n");
		boolean swit=true;
		int balence=10000;
		String details="";
		Scanner in=new Scanner(System.in);
		while(swit==true)
		{
			int scanf=in.nextInt();
			switch(scanf)
			{
			case 1:
				System.out.println("*************当前收支明细**************\n");
				System.out.println("收  支\t账户金额\t  收支金额\t   说  明\n");
				System.out.println(details);
				System.out.println("************************************\n");
				break;
			case 2:
				System.out.print("本次收入金额: ");
				int money=in.nextInt();
				System.out.print("本次收入说明: ");
				String info=in.nextLine();
				balence+=money;
				details+=("收  入\t"+balence+"\t"+  money+"\t"+"info"+"\n");
				System.out.println("*************登记成功***************\n");
				break;
			case 3:
				System.out.println("*************请您登记支出**************\n");
				break;
			case 4:
				System.out.println("是否确认退出?(Y/N):\n");
				char c=in.next().charAt(0);
				if(c=='Y')
				{
					swit=false;
				}
				break;
			default:
				System.out.println("输入错误，请重新输入!!!\n");
				break;
			}
		}
	}
}
