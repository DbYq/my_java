package start;

public class start
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.name="Tom";
		p1.isMale=true;
		System.out.println(p1.name);
		p1.talk("Chinese");
		p1.eat();
	}

}
class Person
{
	String name;
	int age=20;
	boolean isMale;
	public void eat()
	{
		System.out.println("人可以吃饭");
	}
	public void sleep()
	{
		System.out.println("人可以睡觉");
	}
	public void talk(String language)
	{
		System.out.println("人可以说话,使用的是:"+language);
	}
}