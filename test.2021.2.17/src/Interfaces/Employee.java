package Interfaces;

public class Employee implements Comparable<Employee>
{
	private String name;
	private double salary;

	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public void raiseSalary(double byPersent)
	{
		salary += salary * byPersent / 100;
	}

	@Override
	public int compareTo(Employee other)
	{
		// TODO Auto-generated method stub
		return Double.compare(salary, other.salary);
	}

	public String toString()
	{
		return "name:" + getName() + ",salary:" + getSalary();
	}
}
