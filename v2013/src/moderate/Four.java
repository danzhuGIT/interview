package moderate;

public class Four {
	public static void main(String[] args){
		int a=10;
		int b=2;
		int c=a-b;
		int flag=c>>31&1;
		int max=a-flag*(a-b);
		System.out.print(max);
	}
}
