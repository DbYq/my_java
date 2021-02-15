package ShowTest;

import com.my.java.Window;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Window w = new Window();

		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);

		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");

		t1.start();
		t2.start();
		t3.start();
	}

}
