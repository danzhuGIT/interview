package leetCode;

public class ReverseBit {
	public static void main(String[] args){
		int x=3;
		int i=1;
		int j=32;
		while(i<j){
			x=reverseBit(x,i,j);
			i++;
			j--;		
		}
		System.out.print(Integer.toBinaryString(x));
		
	}
	
	public static int reverseBit(int x,int i,int j){
		int low=(x>>>(i-1))&1;
		int high=(x>>>(j-1))&1;
		if((low^high)==1)			
			x=x^(1<<(i-1))^(1<<(j-1));
		return x;
	}
}
