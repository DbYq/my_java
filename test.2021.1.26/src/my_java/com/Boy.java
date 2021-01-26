package my_java.com;

public class Boy
{
	private String name;
	private int age;
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void marry(Girl girl)
	{
		System.out.println("我想娶"+girl.getName());
	}
	public void shout()
	{
		if(this.age>=22)
		{
			System.out.println("你可以去登记了");
		}
		else
		{
			System.out.println("再谈会儿恋爱吧");
		}
	}
}
