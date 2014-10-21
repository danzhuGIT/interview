package threadtest;

public class LiftOff implements Runnable{
	int countDown =10;
	private static int taskCount=0;
	private final int id = taskCount++;
	public LiftOff(){}
	public LiftOff(int c){
		countDown=c;
	}
	public String status(){
		return("#"+id+"("+(countDown>0?countDown:"LiftOff!")+")");
	}
	public void run(){
		while(countDown-- >0){
			System.out.println(status());
			//Thread.yield();
		}
	}
}
