package Interfaces;

import java.util.Arrays;

public class EmployeeSortTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		var staff = new Employee[3];
		staff[0] = new Employee("Harry", 5000);
		staff[1] = new Employee("Marry", 6000);
		staff[2] = new Employee("Jack", 5500);

		Arrays.sort(staff);

		for (Employee e : staff)
		{
			System.out.println("name:" + e.getName() + ",salary" + e.getSalary());
		}
		System.out.println("***********************************************");
		for (Employee e : staff)
		{
			System.out.println(e.toString());
		}
	}

}
