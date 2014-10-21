package haitaoblog;

public class RepeatSum {

	private static int sum=0;
	private static int n=0;
	public RepeatSum(){
		n++;
		sum=sum+n;
	}
	
	public int getSum(){
		return sum;
	}
}
