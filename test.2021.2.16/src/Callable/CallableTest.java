package Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest
{

	public static void main(String[] args) throws ExecutionException
	{
		NumThread n1 = new NumThread();
		FutureTask fa = new FutureTask(n1);
		new Thread(fa).start();
		try
		{
			Object sum = fa.get();
			System.out.println(sum);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class NumThread implements Callable<Object>
{

	@Override
	public Object call() throws Exception
	{
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 100; i++)
		{
			if (i % 2 == 0)
			{
				sum += i;
			}
		}
		return sum;
	}

}