package MyIntegerTest;

public class MyIntegerTest
{
	public static void main(String[] args)
	{
		MyInteger m = MyInteger.valueOf(30);
	}
}

class MyInteger
{
	private int value;
	private static MyInteger[] cache = new MyInteger[256];
	private static final int MIN = -128;
	private static final int MAX = 127;

	static
	{
		for (int i = MIN; i <= MAX; i++)
		{
			cache[i + MAX] = new MyInteger(i);
		}
	}

	private MyInteger(int i)
	{
		// TODO Auto-generated constructor stub
		this.value = i;
	}

	static MyInteger valueOf(int i)
	{
		// TODO Auto-generated method stub
		if (i >= MIN && i <= MAX)
		{
			return cache[i + MAX];
		}
		return new MyInteger(i);
	}
}