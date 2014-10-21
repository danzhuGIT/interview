package threadtest;

public class TestThread implements Runnable{

	public void run()
	{
	try
	{
	System.out.println(1);
	Thread.sleep(1000);
	System.out.println(2);
	}
	catch (InterruptedException exception)
	{
	System.out.println(3);
	}
	System.out.println(4);
	}
	public static void main(String[] args){
		Thread t = new Thread(new TestThread());
		t.start();
		t.interrupt();
	}
}
