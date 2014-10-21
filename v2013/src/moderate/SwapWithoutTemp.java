package moderate;

public class SwapWithoutTemp {
	public static void main(String[] args){
		swapWithoutTemp(1,2);
		swapWithoutTemp2(1,2);
		
	}
	
	public static void swapWithoutTemp(int a, int b){
		a=b-a;
		b=b-a;
		a=b+a;
		System.out.print("a:"+a+" ");
		System.out.print("b:"+b+" ");
	}
	public static void swapWithoutTemp2(int a, int b){
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.print("a:"+a+" ");
		System.out.print("b:"+b+" ");
	}
}
