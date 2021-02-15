package com.atguigu.team.service;

import com.atguigu.team.domain.Employee;

/**
 * 負責將Date中的數據封裝到Employee[]數組中，同時提供相關操作Employee[]的方法
 * @author Ding'Bing
 *
 */
public class NameListService
{
	private Employee[] employees;
	
	public NameListService()
	{
		employees=new Employee[Date.EMPLOYEES.length];
	}
	
	public Employee[] getAllEmployees()
	{
		return null;
	}
	public Employee getEmployee(int id)
	{
		return null;
	}
}
