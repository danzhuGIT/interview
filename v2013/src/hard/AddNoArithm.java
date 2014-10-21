package hard;

public class AddNoArithm {
	public static void main(String[] args){
		System.out.print(addNoArithm(1,11));
	}
	public static int addNoArithm(int a,int b){
		if(b==0) return a;
		int sum=a^b;
		int carry=(a&b)<<1;
		return addNoArithm(sum,carry);
		
	}
}
