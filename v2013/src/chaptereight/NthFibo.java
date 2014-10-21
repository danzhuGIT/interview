package chaptereight;

public class NthFibo {
	public static void main(String[] args){
		int n=4;
		int result=fibo(n);
		System.out.println(n+"th Fibonacci number is "+result);
	}
	
	public static int fibo(int n){
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else if(n>1)
			return fibo(n-1)+fibo(n-2);
		else
			return -1;
	}
}
