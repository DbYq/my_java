package my_java.com;

public class Girl
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
	public void marry(Boy boy)
	{
		System.out.println("我想嫁给"+boy.getName());
		boy.marry(this);//this代表当前对象
	}
	public int compare(Girl girl)
	{
		return this.age-girl.age;
	}
}

