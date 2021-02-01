package com.java.test;

public class CustomerView
{
	public CustomerView()
	{
		
	}
		 CustomerList customerList=new CustomerList(10);
		//创建最大包含10个客户对象的CustomerList对象，供以下各成员方法使用
		public void enterMainMenu()
		{
			boolean isFlag=true;
			while(isFlag)
			{
				System.out.println("******************************************");
				System.out.println("***************客户管理系统******************");
				System.out.println("*******1.新建客户            2.删除客户*******");
				System.out.println("*******3.查找客户         4.修改客户信息*******");
				System.out.println("************   5.退出管理系统   *************");
				System.out.println("*******         请选择(1~5)        ********");
				System.out.println("******************************************");
				char menu=CMUtility.readMenuSelection();
				switch(menu)
				{
				case '1':
					addNewCustomer();
					break;
				case '2':
					deleteCustomer();
					break;
				case '3':
					listAllcustomer();
					break;
				case '4':
					modifyCustomer();
					break;
				case '5':
					System.out.println("是否确定退出(Y/N)!!!");
					char isExit=CMUtility.readConfirmSelection();
					if(isExit=='Y')
					{
						isFlag=false;
					}
						
				}
			}
		}
		private void addNewCustomer()
		{
			System.out.println("*****************新建客户*******************");
			System.out.print("姓名：");
			String name=CMUtility.readString(10);
			System.out.print("性别：");
			char gender=CMUtility.readChar();
			System.out.print("年龄：");
			int age=CMUtility.readInt();
			System.out.print("电话：");
			String phone=CMUtility.readString(11);
			System.out.print("邮箱：");
			String email=CMUtility.readString(20);
			Customer customer=new Customer(name,gender,age,phone,email);
			boolean isSeccess=customerList.addCustomer(customer);
			if(isSeccess==true)
			{
				System.out.println("*****************新建成功*******************");
			}
			else
			{
				System.out.println("***********客户目录已满，新建失败！！！************");
			}
		}
		private void modifyCustomer()
		{
			System.out.println("*****************修改客户信息*******************");
			Customer cust;
			int number;
			for(;;)
			{
				if(customerList.getTotal()==0)
				{
					System.out.println("您还没有录入用户信息！！！");
				}
				System.out.print("请选择客户编号(-1)退出：");
				number=CMUtility.readInt();
				if(number==-1)
				{
					return;
				}
				cust=customerList.getCustomer(number-1);
				if(cust==null)
				{
					System.out.println("该用户不存在，请重新输入！！！");
				}
				else
				{
					break;
				}
			}
			System.out.print("姓名("+cust.getName()+"):");
			String name=CMUtility.readString(10, cust.getName());
			System.out.print("性别("+cust.getGender()+"):");
			char gender=CMUtility.readChar(cust.getGender());
			System.out.print("年龄("+cust.getAge()+"):");
			int age=CMUtility.readInt();
			System.out.print("电话("+cust.getPhone()+"):");
			String phone=CMUtility.readString(11, cust.getPhone());
			System.out.print("邮箱("+cust.getEmail()+"):");
			String email=CMUtility.readString(20, cust.getEmail());
			Customer custom=new Customer(name,gender,age,phone,email);
			boolean isReplace=customerList.replaceCustomer(number-1, custom);
			if(isReplace)
			{
				System.out.println("*****************修改完成*******************");
			}
			else
			{
				System.out.println("*****************修改失败！！！****************");
			}
		}
		private void deleteCustomer()
		{
			System.out.println("*****************删除客户信息*******************");
			if(customerList.getTotal()==0)
			{
				System.out.println("您还没有录入用户信息！！！");
			}
			int number;
			for(;;)
			{
				System.out.print("请选择待删除的客户编号(-1)退出：");
				number=CMUtility.readInt();
				if(number==-1)
				{
					return;
				}
				Customer cust=customerList.getCustomer(number-1);
				if(cust==null)
				{
					System.out.println("该用户不存在，请重新输入！！！");
				}
				else
				{
					break;
				}
			}
			System.out.print("是否确定删除(Y/N):");
			char isDelete=CMUtility.readConfirmSelection();
			if(isDelete=='Y')
			{
				boolean deleteSuccess=customerList.deleteCustomer(number-1);
				if(deleteSuccess)
				{
					System.out.println("*****************删除成功*******************");
				}
				else
				{
					System.out.println("*****************删除失败*******************");
				}
			}
			else
			{
				return;
			}
		}
		private void listAllcustomer()
		{
			System.out.println("*****************客户列表*******************");
			if(customerList.getTotal()==0)
			{
				System.out.println("您还没有录入用户信息！！！");
			}
			else
			{
				System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
				Customer[] custs=customerList.getAllCustomers();
				for(int i=0;i<custs.length;i++)
				{
					Customer cust=custs[i];
					System.out.println((i+1)+"\t"+cust.getName()+"\t"+cust.getGender()+"\t"
							+cust.getAge()+"\t"+cust.getPhone()+"\t"+cust.getEmail());
				}
			}
			
			System.out.println("******************************************");
		}
		public static void main(String[] args)
		{
			CustomerView view=new CustomerView();
			view.enterMainMenu();
		}
	
}
